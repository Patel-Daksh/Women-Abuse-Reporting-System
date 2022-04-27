/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author dax98
 */
//Adding comment
public class OrganizationDirectory {
      private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<Organization>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
         if (type.getValue().equals(Type.CaseReporter.getValue())){
            organization = new CaseReporterOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.CaseVolunteer.getValue())){
            organization = new CaseVolunteerOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
    public Organization searchOrganizationbyname(String Name){
        for(Organization org: organizationList){
            if(Name.equalsIgnoreCase(org.getName())){
                return org;
            }
            
        }
        return null; 
    }
}
