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
public class SeatList {
    private String flightID;
    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }
    private ArrayList<Seat> seatList;

    public ArrayList<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(ArrayList<Seat> seatList) {
        this.seatList = seatList;
    }
    
    public Seat addSeat(){
        Seat s1=new Seat();
        this.seatList.add(s1);
        return s1;
    }
    
    public void deleteSeat(Seat s1){
        this.seatList.remove(s1);
    }
    
}
