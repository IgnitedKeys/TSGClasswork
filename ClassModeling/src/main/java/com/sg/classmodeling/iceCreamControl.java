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
public class iceCreamControl {
    //temp range
    //expiration 
    //fat percentage
    //pasteurized?
    //homogenized?

    private String expirationDate;
    private double fatPercentage;
    private boolean isPasteurzied;
    private boolean isHomogenized;
    private double currentTempurature;

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getFatPercentage() {
        return fatPercentage;
    }

    public void setFatPercentage(double fatPercentage) {
        this.fatPercentage = fatPercentage;
    }

    public boolean isIsPasteurzied() {
        return isPasteurzied;
    }

    public void setIsPasteurzied(boolean isPasteurzied) {
        this.isPasteurzied = isPasteurzied;
    }

    public boolean isIsHomogenized() {
        return isHomogenized;
    }

    public void setIsHomogenized(boolean isHomogenized) {
        this.isHomogenized = isHomogenized;
    }

    public double getCurrentTempurature() {
        return currentTempurature;
    }

    public void setCurrentTempurature(double currentTempurature) {
        this.currentTempurature = currentTempurature;
    }

}
