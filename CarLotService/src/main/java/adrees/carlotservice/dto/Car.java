/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adrees.carlotservice.dto;

import java.math.BigDecimal;

/**
 *
 * @author angeladrees
 */
public class Car {
    private String VIN;
    private String make;
    private String model;
    private String color;
    
    private BigDecimal price;
    private long odometerMiles;
    
    private CarKey key;
    
    public Car(String VIN) {
        this.VIN = VIN;
    }

    public String getVIN() {
        return VIN;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public long getOdometerMiles() {
        return odometerMiles;
    }

    public void setOdometerMiles(long odometerMiles) {
        this.odometerMiles = odometerMiles;
    }

    
    //carKey
    public CarKey getKey() {
        return key;
    }

    public void setKey(CarKey key) {
        this.key = key;
    }
    
    
}
