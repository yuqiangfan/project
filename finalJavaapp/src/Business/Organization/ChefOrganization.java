/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Food.Material;
import Business.Role.ChefRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author PhythonNo1
 */
public class ChefOrganization extends Organization{
private ArrayList<Material> materialList;

    public ChefOrganization() {
        super(Organization.Type.Chef.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ChefRole());
        return roles;
    }
     public void MaterialDirectory() {
        materialList = new ArrayList<>();
    }

    public ArrayList<Material> getMaterialList() {
        return materialList;
    }
    
    public Material createMaterial(){
        Material material = new Material();
        materialList.add(material);
        return material;
    }
     
}