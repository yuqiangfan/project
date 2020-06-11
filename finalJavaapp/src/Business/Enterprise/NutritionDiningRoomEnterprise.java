/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Food.DishDirectory;
import Business.Food.DietDirectory;
import Business.Food.MaterialDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author PhythonNo1
 */
public class NutritionDiningRoomEnterprise extends Enterprise{

    private DietDirectory flavorDirectory;
    private MaterialDirectory materialDirectory;
    private DishDirectory dishDirectory;
    
    public NutritionDiningRoomEnterprise(String name) {
        super(name, EnterpriseType.NutritionDiningRoom);
        flavorDirectory = new DietDirectory();
        materialDirectory = new MaterialDirectory();
        dishDirectory = new DishDirectory();
    }

    public DietDirectory getFlavorDirectory() {
        return flavorDirectory;
    }

    public void setFlavorDirectory(DietDirectory flavorDirectory) {
        this.flavorDirectory = flavorDirectory;
    }

    public MaterialDirectory getMaterialDirectory() {
        return materialDirectory;
    }

    public void setMaterialDirectory(MaterialDirectory materialDirectory) {
        this.materialDirectory = materialDirectory;
    }

    public DishDirectory getDishDirectory() {
        return dishDirectory;
    }

    public void setDishDirectory(DishDirectory dishDirectory) {
        this.dishDirectory = dishDirectory;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
    
}
