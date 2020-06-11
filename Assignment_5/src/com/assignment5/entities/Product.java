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

public class Product {
    
    int productId;
    int minPrice;
    int maxPrice;
    int targetPrice;

    public Product(int productId, int minPrice, int maxPrice, int targetPrice) {
        this.productId = productId;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.targetPrice = targetPrice;
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

    @Override
    public String toString() {
        return "Product{" + "productId = " + productId + ", minPrice = " + minPrice + ", maxPrice = " + maxPrice + ", targetPrice = " + targetPrice + " }";
    }
        
}
