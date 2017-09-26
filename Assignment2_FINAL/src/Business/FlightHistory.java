/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;

import java.util.ArrayList;

/**
 *
 * @author lijianxi
 */
public class FlightHistory {
    
    private ArrayList<Flight> flightHistory;

    public FlightHistory()
    {   
        //create
        flightHistory=new ArrayList<Flight>();
    }
    
    
    public ArrayList<Flight> getFlightHistory() {
        return flightHistory;
    }

    public void setFlightHistory(ArrayList<Flight> flightHistory) {
        this.flightHistory = flightHistory;
    }
    
     public Flight addFlights()
     {
         Flight fl=new Flight();
         flightHistory.add(fl);
         return fl;
     }  
     
     public void deleteFlight(Flight fl)
     {
         flightHistory.remove(fl);
     }
     
   
}
