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
public class MasterSchedule {
    private ArrayList<Flight> masterSchedule;
    private ArrayList<FlightSchedule> flightschedule;

    public MasterSchedule(){
        masterSchedule =new ArrayList<Flight>();
        flightschedule =new ArrayList<FlightSchedule>();
    }
    
    
    public ArrayList<Flight> getMasterSchedule() {
        return masterSchedule;
    }

    public void setMasterSchedule(ArrayList<Flight> masterSchedule) {
        this.masterSchedule = masterSchedule;
    }

    public ArrayList<FlightSchedule> getFlightschedule() {
        return flightschedule;
    }

    public void setFlightschedule(ArrayList<FlightSchedule> flightschedule) {
        this.flightschedule = flightschedule;
    }
    
    public Flight addFlight(){
        Flight fl1=new Flight();
        masterSchedule.add(fl1);
        return fl1;
    }
    
     public void removeFlight(Flight fl3) {
        masterSchedule.remove(fl3);
    }
     
     public FlightSchedule addFlightSchedule(){
        FlightSchedule fs1=new FlightSchedule();
        flightschedule.add(fs1);
        return fs1;
    }
     
     public void removeFlightSchedule(FlightSchedule fs3) {
        flightschedule.remove(fs3);
    }
     
     
    
    
}
