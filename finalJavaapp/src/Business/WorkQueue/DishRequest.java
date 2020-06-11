/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Food.Dish;


/**
 *
 * @author PhythonNo1
 */
public class DishRequest extends WorkRequest{
    
    private Dish dish;
    private int quantity;
    private int actualQuantity;
    private Enterprise senderEnterprise;
    private Enterprise receiverEnterprise;

    public Dish getHair() {
        return dish;
    }

    public void setHair(Dish dish) {
        this.dish = dish;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getActualQuantity() {
        return actualQuantity;
    }

    public void setActualQuantity(int actualQuantity) {
        this.actualQuantity = actualQuantity;
    }

    public Enterprise getSenderEnterprise() {
        return senderEnterprise;
    }

    public void setSenderEnterprise(Enterprise senderEnterprise) {
        this.senderEnterprise = senderEnterprise;
    }

    public Enterprise getReceiverEnterprise() {
        return receiverEnterprise;
    }

    public void setReceiverEnterprise(Enterprise receiverEnterprise) {
        this.receiverEnterprise = receiverEnterprise;
    }
  
    @Override
    public String toString() {
        return getHair().toString();
    }
    
}
