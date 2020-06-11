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

public class ProductData {
    
    private int productId;
    private int minPrice;
    private int maxPrice;
    private int targetPrice;
    private double averageSalesPrice;
    private double diffPrice;

    public ProductData(int productId, int minPrice, int maxPrice, int targetPrice, double averageSalesPrice, double diffPrice) {
        this.productId = productId;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.targetPrice = targetPrice;
        this.averageSalesPrice = averageSalesPrice;
        this.diffPrice = diffPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    public int getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(int targetPrice) {
        this.targetPrice = targetPrice;
    }

    public double getAverageSalesPrice() {
        return averageSalesPrice;
    }

    public void setAverageSalesPrice(double averageSalesPrice) {
        this.averageSalesPrice = averageSalesPrice;
    }

    public double getDiffPrice() {
        return diffPrice;
    }

    public void setDiffPrice(double diffPrice) {
        this.diffPrice = diffPrice;
    }   
    
}
