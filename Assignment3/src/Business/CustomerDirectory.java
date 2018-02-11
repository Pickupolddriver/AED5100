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
public class CustomerDirectory {

    private ArrayList<Person> customerdirectory;

    public ArrayList<Person> getCustomerdirectory() {
        return customerdirectory;
    }

    public void setCustomerdirectory(ArrayList<Person> customerdirectory) {
        this.customerdirectory = customerdirectory;
    }

    public Person addPerson() {
        Person p1 = new Person();
        this.customerdirectory.add(p1);
        return p1;
    }

    public void deletePerson(Person p1) {
        customerdirectory.remove(p1);
    }

    
}
