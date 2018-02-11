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

    public Flight addFlight(){
        Flight f1=new Flight();
        this.masterSchedule.add(f1);
        return f1;
    } 
    
    public void deleteFlight(Flight f1){
        this.masterSchedule.remove(f1);
    }
    
    public ArrayList<Flight> getFlightSchedule() {
        return masterSchedule;
    }

    public void setFlightSchedule(ArrayList<Flight> flightSchedule) {
        this.masterSchedule = flightSchedule;
    }
    

}
