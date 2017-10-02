/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Person;
import java.util.ArrayList;

/**
 *
 * @author lijianxi
 */
public class CustomerDirectory {
     
    private ArrayList<Person> customerdirectory;

    public CustomerDirectory()
    {   
        //create
        customerdirectory=new ArrayList<Person>();
    }

    public ArrayList<Person> getFleet() {
        return customerdirectory;
    }

    public void setFleet(ArrayList<Person> customerdirectory) {
        this.customerdirectory =customerdirectory;
    }
    
    
  
    
     public void addPerson(Person person)
     {
         customerdirectory.add(person);
         
     }  
     
     public void deletePerson(Person person)
     {
         customerdirectory.remove(person);
     }
     
   
     
    
}
