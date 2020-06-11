/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Food;

/**
 *
 * @author PhythonNo1
 */
public class Diet {
    private String name;
    private int price;
    private int quantity; //count for profit
    private MaterialDirectory materialDirectory;

    public Diet() {
        materialDirectory = new MaterialDirectory();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public MaterialDirectory getMaterialDirectory() {
        return materialDirectory;
    }

    public void setMaterialDirectory(MaterialDirectory materialDirectory) {
        this.materialDirectory = materialDirectory;
    }

    
    @Override
    public String toString() {
        return name;
    }
}
