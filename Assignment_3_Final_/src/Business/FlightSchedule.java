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
    private ArrayList<Flight> airlinerSchedule;
    
    public FlightSchedule(){
        airlinerSchedule=new ArrayList<Flight>();
    }
    
    
    public Flight addFlight(){
        Flight f1=new Flight();
        this.airlinerSchedule.add(f1);
        return f1;
    }

    public String getAirliner() {
        return airliner;
    }

    public void setAirliner(String airliner) {
        this.airliner = airliner;
    }
    
    
    
    public void deleteFlight(Flight f1){
        this.airlinerSchedule.remove(f1);
    }
    
    public ArrayList<Flight> getAirlinerSchedule() {
        return airlinerSchedule;
    }

    public void setAirlinerSchedule(ArrayList<Flight> airlinerSchedule) {
        this.airlinerSchedule = airlinerSchedule;
    }

  
    
}
