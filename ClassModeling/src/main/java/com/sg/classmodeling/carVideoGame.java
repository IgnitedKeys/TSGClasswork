/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.classmodeling;

/**
 *
 * @author gavinlinnihan
 */
public class carVideoGame {

    //model
    //color
    //handling
    //speed
    private String model;
    private String color;
    private int handling;
    private int topSpeed;

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

    public int getHandling() {
        return handling;
    }
    //player doesn't get to choose the handling of the car.
    /*public void setHandling(int handling) {
        this.handling = handling;
    }*/

    public int getSpeed() {
        return topSpeed;
    }
    //player doesn't get to choose the speed of the car
    /*public void setSpeed(int speed) {
        this.topSpeed = speed;
    }
*/

}
