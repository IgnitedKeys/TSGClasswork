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
public class airplaneFlightSim {
    //plane model
    //weather
    //airdensity
    //turbulence
    //reactionTimes

    private String planeModel;
    private String currentWeather;
    private double airDensity;
    private boolean turbulence;
    private double[] reactionTimes;
    private double overallReactionTime;

    public String getPlaneModel() {
        return planeModel;
    }

    public void setPlaneModel(String planeModel) {
        this.planeModel = planeModel;
    }

    public String getCurrentWeather() {
        return currentWeather;
    }

    public void setCurrentWeather(String currentWeather) {
        this.currentWeather = currentWeather;
    }

    public double getAirDensity() {
        return airDensity;
    }

    public void setAirDensity(double airDensity) {
        this.airDensity = airDensity;
    }

    public boolean isTurbulence() {
        return turbulence;
    }

    public void setTurbulence(boolean turbulence) {
        this.turbulence = turbulence;
    }

    public double[] getReactionTimes() {
        return reactionTimes;
    }

    /*
    public void setReactionTimes(double[] reactionTimes) {
        this.reactionTimes = reactionTimes;
    }
     */
    public double getOverallReactionTime() {
        int average = 0;
        for(int i = 0; i < reactionTimes.length; i++){
            average += i;
        }
        return average / reactionTimes.length;
    }

    /*
    public void setOverallReactionTime(double overallReactionTime) {
        this.overallReactionTime = overallReactionTime;
    }
     */
}
