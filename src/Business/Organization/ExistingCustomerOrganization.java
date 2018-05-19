/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ExistingCustomerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class ExistingCustomerOrganization extends Organization {
    public ExistingCustomerOrganization(){
        super(Organization.Type.ExistingCustomer.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ExistingCustomerRole());
        return roles;
    }
}
