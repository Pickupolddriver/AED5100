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
public class Airliner {

    private String name;
    private String location;
    private Fleet fleet;
    private FlightSchedule fs;
    private int numplane;

    
    public int getNumplane() {
        return numplane;
    }

    public void setNumplane(int numplane) {
        this.numplane = numplane;
    }
    
    
    
    public Airliner(){
        fs=new FlightSchedule();
        fleet=new Fleet();
        numplane=this.getFleet().getFleet().size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Fleet getFleet() {
        return fleet;
    }

    public void setFleet(Fleet fleet) {
        this.fleet = fleet;
    }
    
    public Fleet addFleet(){
        Fleet fleet1=new Fleet();
        this.fleet=fleet1;
        return fleet1;
    }

    public FlightSchedule getFs() {
        return fs;
    }

    public void setFs(FlightSchedule fs) {
        this.fs = fs;
    }
    
    
    
    @Override
    public String toString(){
        return name;
    }

}
