/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.VerificationRole;
import java.util.ArrayList;

/**
 *
 * @author user
 */

public class VerificationOrganization extends Organization {
    public VerificationOrganization(){
        super(Organization.Type.Verification.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new VerificationRole());
        return roles;
    }
}
