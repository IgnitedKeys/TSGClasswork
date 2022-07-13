/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.classmodeling;

/**
 *
 * @author angeladrees
 */
public class iceCreamStocking {
    private String flavor;
    private int currentStock;
    private int stockNeeded;
    private int stockToOrder;

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(int currentStock) {
        this.currentStock = currentStock;
    }

    public int getStockNeeded() {
        return stockNeeded;
    }

    public void setStockNeeded(int stockNeeded) {
        this.stockNeeded = stockNeeded;
    }

    public int getStockToOrder() {
        int stockNumber = stockNeeded - currentStock;
        return stockNumber;
    }

    public void setStockToOrder(int stockToOrder) {
        this.stockToOrder = stockToOrder;
    }
    
   
    
    
    
    
    
}
