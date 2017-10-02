/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author lijianxi
 */
public class FlightSchedule {
    
    ArrayList<Flight> flightschedule;

   
    public ArrayList<Flight> getFlightSchedule() {
        return flightschedule;
    }

    public void setFlightSchedule(ArrayList<Flight> flightschedule) {
        this.flightschedule = flightschedule;
    }

    public FlightSchedule() {
        this.flightschedule = new ArrayList<>();
    }

    public Flight addFLight() {
       Flight flight = new Flight();
        flightschedule.add(flight);
        return flight; //To change body of generated methods, choose Tools | Templates.
    }
    
}
