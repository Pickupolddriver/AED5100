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
public class Flight {
    private String airport;
    private String flighttime;
    airplane airplane;

    public Flight() {
        airplane= new airplane();  
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getFlighttime() {
        return flighttime;
    }

    public void setFlighttime(String flighttime) {
        this.flighttime = flighttime;
    }

    public airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(airplane airplane) {
        this.airplane = airplane;
    }
    
   @Override
    public String toString()
    {
        return this.airport;
    }
   
}
