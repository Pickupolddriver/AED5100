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
public class SeatArraylist {
    
    private ArrayList<Seat> seatarraylist;

    public SeatArraylist()
    {   
        //create
        seatarraylist=new ArrayList<Seat>();
    }

    public ArrayList<Seat> getSeatArraylist() {
        return seatarraylist;
    }

    public void setSeatArraylist(ArrayList<Seat> seatarraylist) {
        this.seatarraylist = seatarraylist;
    }
    
    
     public void addSeat(Seat seat)
     {   
         
         seatarraylist.add(seat);
         
     }  
     
     public void deleteSeat(Seat seat)
     {
         seatarraylist.remove(seat);
     }
     
}
