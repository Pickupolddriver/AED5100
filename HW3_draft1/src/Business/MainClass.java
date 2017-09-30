/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Business.Flight;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lijianxi
 */
public class MainClass {
    public static void main(String args[]) { 
       Person via=new Person();
       Person obama=new Person();
       Flight flight=new Flight();
       Seat vseat=new Seat();
       Seat zseat=new Seat();
       AirPlane AF1=new AirPlane();
       SeatArraylist seatarr=new SeatArraylist();
       flight.setAirplane(AF1);
       
       AF1.setAirliner("NASA");
       AF1.setManufacturer("Boeing");
       AF1.setModelnumber("747");
       
       
       via.setFirstName("Via");
       obama.setFirstName("obama");
       
       vseat.setColum(1);
       vseat.setRow(1);
       vseat.setPrice(60);
       vseat.setPerson(via);
       
       zseat.setColum(2);
       zseat.setRow(2);
       zseat.setPrice(55);
       zseat.setPerson(obama);
       
      
       flight.setDeparture("PEK");
       flight.setDestination("DET");
        try {
            flight.setFlighttime("09/11/2017 10:00");
        } catch (ParseException ex) {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        seatarr.addSeat(zseat);
        seatarr.addSeat(vseat);
        flight.seatarray=seatarr;
        
        
        ArrayList<Seat> xxx = flight.seatarray.getSeatArraylist();//this is a <special><flight> NAME:flight!!!! 
        int price1=xxx.get(0).getPrice();
        int c1=xxx.get(0).getColum();
        int r1=xxx.get(0).getRow();
        String name=xxx.get(0).getPerson().getFirstName();
        
        System.out.println("price:"+price1+","+"colum:"+c1+","+"row:"+r1+",name:"+name);
        
        
        
        
    }
        
        
    } 

