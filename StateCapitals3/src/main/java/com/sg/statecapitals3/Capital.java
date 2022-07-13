/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.statecapitals3;

/**
 *
 * @author angeladrees
 */
public class Capital {
    private String name;
    private int population;
    private double sqMi;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getSqMi() {
        return sqMi;
    }

    public void setSqMi(double sqMi) {
        this.sqMi = sqMi;
    }
    


    //constructor???
    public Capital(String nameIn, int populationIn, double sqMiIn){
        this.name = nameIn;
        this.population = populationIn;
        this.sqMi = sqMiIn;
    }
    
    
}
