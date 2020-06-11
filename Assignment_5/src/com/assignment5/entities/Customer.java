/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.entities;

import java.util.ArrayList;

/**
 *
 * @author PythonNo1
 */

public class Customer {
    
    int customerId;
    ArrayList<Integer> orderList;

    public Customer(int customerId) {
        this.customerId = customerId;
        this.orderList = new ArrayList<>();
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public ArrayList<Integer> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Integer> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "Customer{" + " customerId = " + customerId + ", numbers of order = " + orderList.size() + " }";
    }
    
}
