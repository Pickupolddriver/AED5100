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
    private ArrayList<Person> personlist;
    
    public SeatList(){
        personlist=new ArrayList<Person>();
    }

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public ArrayList<Person> getPersonlist() {
        return personlist;
    }

    public void setPersonlist(ArrayList<Person> personlist) {
        this.personlist = personlist;
    }

    public void addPerson(Person p1) {
       
        this.personlist.add(p1);
        
    }

    public void deletePerson(Seat s1) {
        this.personlist.remove(s1);
    }

}
