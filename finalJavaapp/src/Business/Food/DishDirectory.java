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
public class DishDirectory {
    private ArrayList<Dish> dishList;

    public DishDirectory() {
        dishList = new ArrayList<>();
    }

    public ArrayList<Dish> getDishList() {
        return dishList;
    }
    
    public Dish createDish(){
        Dish hair = new Dish();
        dishList.add(hair);
        return hair;
    }
    public Dish removeDish(Dish dish){
        
        dishList.remove(dish);
        return null;
    }
}
