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
     private int SumofAllairliner;

    
     
    public AllAirliner()
    {   
        //create
        Allairliner=new ArrayList<Airliner>();
    }

    public ArrayList<Airliner> getAllAirliner() {
        return Allairliner;
    }

    public void setAllAirliner(ArrayList<Airliner> Allairliner) {
        this.Allairliner = Allairliner;
    }
    
    
    
     public void addAirliner(Airliner airline)
     {
        
         Allairliner.add(airline);
         
     }  
     
     public void deleteAirplans(Airliner airline)
     {
         Allairliner.remove(airline);
     }

    public int getSumofAllairliner() {
        int i=0;
        int summm=0;
        int siz=this.getAllAirliner().size();
        for(i=0;i<siz;i++)
        {
            int peral=this.getAllAirliner().get(i).getAirlinerRevenue();
            summm=summm+peral;
        }
        SumofAllairliner=summm;
        return SumofAllairliner;
    }

    public void setSumofAllairliner(int SumofAllairliner) {
        this.SumofAllairliner = SumofAllairliner;
    }
    
    
    public void printAllAirlinerRevenue()
    {
        int i=0;
        int siz=this.getAllAirliner().size();
        for(i=0;i<siz;i++)
        {
           String name=this.getAllAirliner().get(i).getNameOfAirliner();
           int perRevenue=this.getAllAirliner().get(i).getAirlinerRevenue();
           System.out.println("Airliner: "+name+"'s total revenue is  "+perRevenue);
           
        }
        
    }
     
    
    
   
    
     
}
