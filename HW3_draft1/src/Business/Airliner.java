/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author lijianxi
 */
public class Airliner {
    private String nameOfAirliner;
    Fleet fleet;
    FlightSchedule fs;

    public Airliner() {
        fleet= new Fleet();
        fs= new FlightSchedule();
       
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
