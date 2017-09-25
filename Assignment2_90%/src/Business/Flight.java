/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author lijianxi
 */
public class Flight {
    private String airport;
    private Date flighttime;
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

    public Date getFlighttime() {
       
        return flighttime;
    }

    public void setFlighttime(String flighttime) throws ParseException {
         DateFormat dq = new SimpleDateFormat("MM/dd/yyyy HH:mm");
         
        Date startDate= dq.parse(flighttime);
        try {
                startDate = dq.parse(flighttime);
                
                
            } 
        catch (ParseException e) 
            {
                e.printStackTrace();
            }

        this.flighttime = startDate;
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
