/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.FarmerRole;
import java.util.ArrayList;

/**
 *
 * @author PhythonNo1
 */
public class FarmerOrganization extends Organization{

    public FarmerOrganization() {
        super(Organization.Type.Farmer.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FarmerRole());
        return roles;
    }
     
}