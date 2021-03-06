/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ExistingCustomerOrganization;
import Business.Organization.NewCustomerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.NewCustomerRole.NewCustomerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class NewCustomerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new NewCustomerWorkAreaJPanel(userProcessContainer, (NewCustomerOrganization)organization, enterprise);
    }
}
