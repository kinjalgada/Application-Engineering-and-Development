/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Customer.Customer;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;


/**
 *
 * @author user
 */
public class ConfigureASystem {
    public static EcoSystem configure(){
        EcoSystem system = EcoSystem.getInstance();
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH", "6179532913", "kinjalgada3@gmail.com", "14-03-1992");
        Network network = system.createAndAddNetwork();
        network.setName("Imperial");
        EnterpriseDirectory enterpriseDirectory = network.getEnterpriseDirectory();
        Enterprise enterprise = enterpriseDirectory.createAndAddEnterprise("Boston", Enterprise.EnterpriseType.InsuranceCompany);
        Customer customer = null;
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, customer, new SystemAdminRole());
        return system;
    }
}
