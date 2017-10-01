/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author lijianxi
 */
public class Flight {
   
    private String departure;
    private String destination;
    private String flightID;//exp DL188;

    SeatArraylist seatarray;
    AirPlane airplane;
    private int flightrevenue;//sum of (unit price of seat) *(number of seat which are sold)

    public Flight() {
         airplane=new AirPlane();
         seatarray=new SeatArraylist();
         
    }

    public SeatArraylist getSeatarray() {
        return seatarray;
    }

    public void setSeatarray(SeatArraylist seatarray) {
        this.seatarray = seatarray;
    }
            
   
   
   
  

    public int getFlightrevenue() {
        return flightrevenue;
    }

    public void setFlightrevenue(int flightrevenue) {
        this.flightrevenue = flightrevenue;
    }
    


    
    
    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

 

    public AirPlane getAirplane() {
        return airplane;
    }

    public void setAirplane(AirPlane airplane) {
        this.airplane = airplane;
    }

    
    
}
