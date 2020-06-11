/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Nutrition.NutritionDirectory;
import Business.Food.DishDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author PhythonNo1
 */
public class OnlineStoreEnterprise extends Enterprise{

    private DishDirectory dishDirectory;
    private NutritionDirectory nutrDirectory;
    
    public OnlineStoreEnterprise(String name) {
        super(name, EnterpriseType.OnlineStore);
        dishDirectory = new DishDirectory();
        nutrDirectory = new NutritionDirectory();
    }

    public DishDirectory getDishDirectory() {
        return dishDirectory;
    }

    public void setDishDirectory(DishDirectory dishDirectory) {
        this.dishDirectory = dishDirectory;
    }

    public NutritionDirectory getNutrDirectory() {
        return nutrDirectory;
    }

    public void setNutrDirectory(NutritionDirectory nutrDirectory) {
        this.nutrDirectory = nutrDirectory;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
    
}
