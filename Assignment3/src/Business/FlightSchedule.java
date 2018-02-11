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
    private String airliner;
    private ArrayList<Flight> flightSchedule;

    public Flight addFlight(){
        Flight f1=new Flight();
        this.flightSchedule.add(f1);
        return f1;
    }

    public String getAirliner() {
        return airliner;
    }

    public void setAirliner(String airliner) {
        this.airliner = airliner;
    }
    
    
    
    public void deleteFlight(Flight f1){
        this.flightSchedule.remove(f1);
    }
    
    public ArrayList<Flight> getFlightSchedule() {
        return flightSchedule;
    }

    public void setFlightSchedule(ArrayList<Flight> flightSchedule) {
        this.flightSchedule = flightSchedule;
    }
    
}
