/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Nutrition;

import java.util.ArrayList;

/**
 *
 * @author PhythonNo1
 */
public class NutritionDirectory {
    private ArrayList<Nutrition> nutritionList;

    public NutritionDirectory() {
        nutritionList = new ArrayList<>();
    }

    public ArrayList<Nutrition> getNutrList() {
        return nutritionList;
    }
    
    public Nutrition createNutr(){
        Nutrition nut = new Nutrition();
        nutritionList.add(nut);
        return nut;
    }
}
