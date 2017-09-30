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
public class AllAirliner {
     private ArrayList<Airliner> Allairliner;

    public AllAirliner()
    {   
        //create
        Allairliner=new ArrayList<Airliner>();
    }

    public ArrayList<Airliner> getFleet() {
        return Allairliner;
    }

    public void setFleet(ArrayList<Airliner> Allairliner) {
        this.Allairliner = Allairliner;
    }
    
    
  
    
     public Airliner addAirliner()
     {
         Airliner al=new Airliner();
         Allairliner.add(al);
         return al;
     }  
     
     public void deleteAirplans(Airliner al)
     {
         Allairliner.remove(al);
     }
    
}
