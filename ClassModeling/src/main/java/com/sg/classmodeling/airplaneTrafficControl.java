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
public class airplaneTrafficControl {
    
   //airpline name
    //flight number
    //airplane aircraft and equiptment
    //route of flight
        //departure airport
        //crossover
        //destination airport
    
    private String airplaneName;
    private String flightNumber;
    private String aircraft;
    private String departureAirport;
    private String destinationAirport;

    public String getAirplaneName() {
        return airplaneName;
    }

    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }
/*
    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }
*/
    public String getDestinationAirport() {
        return destinationAirport;
    }
/*
    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }
  */
    
    //the destination and departure is attached to the flight number, so the user shouldn't be able to change those
}
