/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author lijianxi
 */
public class MasterSchedule {
    //装FlightSchedule的ArrayList
    private ArrayList<FlightSchedule> masterschedule;

    public MasterSchedule()
    {   
        //create
        masterschedule=new ArrayList<FlightSchedule>();
    }

    public ArrayList<FlightSchedule> getMasterSchedule() {
        return masterschedule;
    }

    public void setFleet(ArrayList<FlightSchedule> masterschedule) {
        this.masterschedule = masterschedule;
    }
    
    
  
    
     public void addMasterSchedule(FlightSchedule fs)
     {
         
         masterschedule.add(fs);
        
     }  
     
     public void deleteMasterSchedule(FlightSchedule fs)
     {
         masterschedule.remove(fs);
     }
     
    public void printEachFlightRevenue()
    {
        int i=0;
        int j=0;
        int numOfFlightSche=this.getMasterSchedule().size();
        for(i=0;i<numOfFlightSche;i++)
        {
            FlightSchedule flightschedule = this.getMasterSchedule().get(i);
            int numOfFlight=flightschedule.getFlightSchedule().size();
               for(j=0;j<numOfFlight;j++)
               {
                Flight flight = flightschedule.getFlightSchedule().get(j);
                flight.printFlightrevenue();
               }
                
        
        }
    
    }
    
    
    
}