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
public class TravelAgency {
    private String name;
    private CustomerDirectory customerditrectory;
    private MasterSchedule masterschedule;
    private AirlinerDirectory airlinerdirectory;

    public TravelAgency() {
        this.name="WhyMe";
        this.airlinerdirectory = new AirlinerDirectory();
        this.masterschedule= new MasterSchedule();
        this.customerditrectory=new CustomerDirectory();
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerDirectory getCustomerditrectory() {
        return customerditrectory;
    }

    public void setCustomerditrectory(CustomerDirectory customerditrectory) {
        this.customerditrectory = customerditrectory;
    }

    public MasterSchedule getMasterschedule() {
        return masterschedule;
    }

    public void setMasterschedule(MasterSchedule masterschedule) {
        this.masterschedule = masterschedule;
    }

    public AirlinerDirectory getAirlinerdirectory() {
        return airlinerdirectory;
    }

    public void setAirlinerdirectory(AirlinerDirectory airlinerdirectory) {
        this.airlinerdirectory = airlinerdirectory;
    }

   
    
    
}
