/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Organization.Organization;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class CustomerDirectory {
    private List<Customer> customerList;
    
    public CustomerDirectory() {
        customerList = new ArrayList<Customer>();
    }
    
    public List<Customer> getCustomerlist(){
        return customerList;
    }
    
    public Customer addCustomer(String name, String phone, String dob, String ssn, String email, Organization organization){
        Customer c = new Customer();
        c.setCustName(name);
        c.setPhone(phone);
        c.setDob(dob);
        c.setDob(ssn);
        c.setEmail(email);
        c.setOrganization(organization);
        customerList.add(c);
        return c;
    }
    
    public void removeCustomer(Customer c){
        customerList.remove(c);
    }
    
    public Customer searchCustomer(String keyword){
        for (Customer customer : customerList) {
            if(customer.getCustName().equals(keyword)){
                return customer;
            }
        }
        return null;
    }
}
