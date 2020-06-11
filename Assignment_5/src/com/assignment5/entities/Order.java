/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.entities;

/**
 *
 * @author PhythonNo1
 */

public class Order {
    
    int orderId;
    int salesPersonId;
    int customerId;
    int itemId;

    public Order(int orderId, int salesPersonId, int customerId, int itemId) {
        this.orderId = orderId;
        this.salesPersonId = salesPersonId;
        this.customerId = customerId;
        this.itemId = itemId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getSalesPersonId() {
        return salesPersonId;
    }

    public void setSalesPersonId(int salesPersonId) {
        this.salesPersonId = salesPersonId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    @Override
    public String toString() {
        return "Order{" + "orderId = " + orderId + ", salesPersonId = " + salesPersonId + ", customerId = " + customerId + ", itemId = " + itemId + " }";
    }
    
    
}
