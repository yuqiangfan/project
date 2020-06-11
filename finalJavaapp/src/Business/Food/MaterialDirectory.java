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
public class MaterialDirectory {
    private ArrayList<Material> materialList;

    public MaterialDirectory() {
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
