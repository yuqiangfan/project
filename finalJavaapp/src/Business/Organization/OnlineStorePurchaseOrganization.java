/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.OnlineStorePurchasemanRole;
import java.util.ArrayList;

/**
 *
 * @author PhythonNo1
 */
public class OnlineStorePurchaseOrganization extends Organization{

    public OnlineStorePurchaseOrganization() {
        super(Organization.Type.OnlineStorePurchase.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new OnlineStorePurchasemanRole());
        return roles;
    }
     
}