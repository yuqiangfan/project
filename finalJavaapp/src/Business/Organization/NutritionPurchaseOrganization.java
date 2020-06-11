/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.NutritionPurchasemanRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author PhythonNo1
 */
public class NutritionPurchaseOrganization extends Organization{

    public NutritionPurchaseOrganization() {
        super(Organization.Type.NutritionPurchase.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new NutritionPurchasemanRole());
        return roles;
    }
     
}