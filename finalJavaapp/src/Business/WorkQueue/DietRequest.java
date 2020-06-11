/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Food.Diet;

/**
 *
 * @author PhythonNo1
 */
public class DietRequest extends WorkRequest{
    
    private Diet diet;

    public Diet getHairStyle() {
        return diet;
    }

    public void setHairStyle(Diet diet) {
        this.diet = diet;
    }

    @Override
    public String toString() {
        return getHairStyle().toString();
    }
    
}
