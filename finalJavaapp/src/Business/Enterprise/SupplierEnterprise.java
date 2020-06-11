/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Food.MaterialDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author PhythonNo1
 */
public class SupplierEnterprise extends Enterprise{

    private MaterialDirectory materialDirectory;
    private MaterialDirectory soldMaterialDirectory;
    
    public SupplierEnterprise(String name) {
        super(name, EnterpriseType.Supplier);
        materialDirectory = new MaterialDirectory();
        soldMaterialDirectory = new MaterialDirectory();
    }

    public MaterialDirectory getMaterialDirectory() {
        return materialDirectory;
    }

    public void setMaterialDirectory(MaterialDirectory materialDirectory) {
        this.materialDirectory = materialDirectory;
    }

    public MaterialDirectory getSoldMaterialDirectory() {
        return soldMaterialDirectory;
    }

    public void setSoldMaterialDirectory(MaterialDirectory soldMaterialDirectory) {
        this.soldMaterialDirectory = soldMaterialDirectory;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
    
}
