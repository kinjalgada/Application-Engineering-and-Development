/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory(){
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if(type.getValue().equals(Type.ExistingCustomer.getValue())){
            organization = new ExistingCustomerOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Verification.getValue())){
            organization = new VerificationOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.NewCustomer.getValue())){
            organization = new NewCustomerOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}
