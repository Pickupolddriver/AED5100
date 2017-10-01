/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import static java.lang.Double.sum;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 *
 * @author lijianxi
 */
public class Airliner {
    private String nameOfAirliner;
    private Fleet fleet;
    private FlightSchedule fs;
    private int airlinerRevenue;
    
    
    
    
    public Airliner() {
        fleet= new Fleet();
        fs= new FlightSchedule();
       
    }

    public int getAirlinerRevenue() {
        int i=0;
        int summm=0;
        int siz=this.fs.getFlightSchedule().size();
        for(i=0;i<siz;i++)
        {
        int sumperflight=this.fs.getFlightSchedule().get(i).getFlightrevenue();//get one flight
        summm=summm+sumperflight;
        }
        airlinerRevenue=summm;
        return airlinerRevenue;
    }

    public void setAirlinerRevenue(int airlinerRevenue) {
        this.airlinerRevenue = airlinerRevenue;
    }
    
    

   
    
    

    public String getNameOfAirliner() {
        return nameOfAirliner;
    }

    public void setNameOfAirliner(String nameOfAirliner) {
        this.nameOfAirliner = nameOfAirliner;
    }

    public Fleet getFleet() {
        return fleet;
    }

    public void setFleet(Fleet fleet) {
        this.fleet = fleet;
    }

    public FlightSchedule getFs() {
        return fs;
    }

    public void setFs(FlightSchedule fs) {
        this.fs = fs;
    }

   
   
    
    
}
