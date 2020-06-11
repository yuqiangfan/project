/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Food;

import java.util.ArrayList;

/**
 *
 * @author PhythonNo1
 */
public class DietDirectory {
    private ArrayList<Diet> flavorList;

    public DietDirectory() {
        flavorList = new ArrayList<>();
    }

    public ArrayList<Diet> getFlavorList() {
        return flavorList;
    }
    
    public Diet createFlavor(){
        Diet flavor = new Diet();
        flavorList.add(flavor);
        return flavor;
    }
    public Diet createFlavor(Diet diet){
        
        flavorList.remove(diet);
        return null;
    }
}
