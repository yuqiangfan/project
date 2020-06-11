/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Food;

import Business.Nutrition.NutritionDirectory;

/**
 *
 * @author PhythonNo1
 */
public class Sample extends Dish {
    private NutritionDirectory nutrDirectory;

    public NutritionDirectory getNutrDirectory() {
        return nutrDirectory;
    }

    public void setNutrDirectory(NutritionDirectory nutrDirectory) {
        this.nutrDirectory = nutrDirectory;
    }
    
}
