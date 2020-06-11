/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SupplierPurchasemanRole;
import java.util.ArrayList;

/**
 *
 * @author PhythonNo1
 */
public class SupplierPurchaseOrganization extends Organization{

    public SupplierPurchaseOrganization() {
        super(Organization.Type.SupplierPurchase.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SupplierPurchasemanRole());
        return roles;
    }
     
}