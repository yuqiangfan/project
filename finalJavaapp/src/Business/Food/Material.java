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
public class Material {
    private String name;
    private int quantity;
    private int price;
    
    public enum MaterialType{
        Beef("Beef", 20),
        Chicken("Chicken", 18),
        Pork("Pork", 15),
        Potato("Potato", 4),
        Onion("Onion", 3),
        Tomato("Tomato", 4),
        Lettuce("Lettuce", 3);
        //Rice("Rice", 5);

        private MaterialType() {
        }
        
        private String value;
        private int price;
        private MaterialType(String value, int price){
            this.value = value;
            this.price = price;
        }

        public String getValue() {
            return value;
        }
        
        public int getPrice() {
            return price;
        }
                
        @Override
        public String toString() {
            return value;
        }
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
