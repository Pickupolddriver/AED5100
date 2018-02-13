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
public class Flight {

    private String airliner;
    private String flightID;
    private String departure;
    private String destination;
    private String flytime;
    private String Date;
    private String serialNumber;
    //Morning,day,evening
    private Airplane airplane;
    private SeatList seatlist;

    public Flight(){
        seatlist=new SeatList();
    }
    
    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    
    
    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
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

    public String getFlytime() {
        return flytime;
    }

    public void setFlytime(String flytime) {
        this.flytime = flytime;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public String getAirliner() {
        return airliner;
    }

    public void setAirliner(String airliner) {
        this.airliner = airliner;
    }

    public SeatList getSeatlist() {
        return seatlist;
    }

    public void setSeatlist(SeatList seatlist) {
        this.seatlist = seatlist;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    @Override
    public String toString(){
        return this.flightID;
    }
    
    
}
