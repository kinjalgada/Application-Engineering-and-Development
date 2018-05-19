/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ExistingCustomerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.ExistingCustomerRole.ExisitingCustomerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class ExistingCustomerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ExisitingCustomerWorkAreaJPanel(userProcessContainer, account, (ExistingCustomerOrganization)organization, enterprise);
    }
}
