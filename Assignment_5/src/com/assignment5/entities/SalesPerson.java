/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.entities;

import java.util.ArrayList;

/**
 *
 * @author PhythonNo1
 */

public class SalesPerson {
    
    int salesId;
    ArrayList<Integer> orderList;

    public SalesPerson(int salesId) {
        this.salesId = salesId;
        this.orderList = new ArrayList<>();
    }

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    public ArrayList<Integer> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Integer> orderList) {
        this.orderList = orderList;
    }
    
    @Override
    public String toString() {
        return "SalesPerson{" + " salesId = " + salesId + ", numbers of order = " + orderList.size() + " }";
    }
    
}
