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
public class Fleet {
    
    
    private ArrayList<AirPlane> fleet;

    public Fleet()
    {   
        //create
        fleet=new ArrayList<AirPlane>();
    }

    public ArrayList<AirPlane> getFleet() {
        return fleet;
    }

    public void setFleet(ArrayList<AirPlane> fleet) {
        this.fleet = fleet;
    }
    
    
  
    
     public void addAirplanes(AirPlane ap)
     {
         fleet.add(ap); 
     }  
     
     public void deleteAirplans(AirPlane ap)
     {
         fleet.remove(ap);
     }
     
    
}
