/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author lijianxi
 */
public class Person {
    private String ID;
    private String name;
    private String gender;

    //Bulid a new constructor to create Person
   public Person(){
   }
    
    
    public Person(String id,String name,String gender){
        this.ID=id;
        this.name=name;
        this.gender=gender;
    }
    
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    @Override
    public String toString(){
        return this.ID;
}
    
}
