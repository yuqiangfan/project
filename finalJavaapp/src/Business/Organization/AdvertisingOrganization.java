/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DieticianRole;
import Business.Role.Role;
import Business.Role.AdvertisingRole;
import java.util.ArrayList;

/**
 *
 * @author PhythonNo1
 */
public class AdvertisingOrganization extends Organization{

    public AdvertisingOrganization() {
        super(Organization.Type.Advertising.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdvertisingRole());
        return roles;
    }
     
}