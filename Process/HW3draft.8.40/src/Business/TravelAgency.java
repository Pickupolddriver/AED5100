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
    private String TravelAgencyname;
    AllAirliner allairliner;
    MasterSchedule masterschedule;
    CustomerDirectory customerdirectory;

    public TravelAgency() {
        allairliner=new AllAirliner();
        masterschedule=new MasterSchedule();
        customerdirectory=new CustomerDirectory();
    }

    public String getTravelAgencyname() {
        return TravelAgencyname;
    }

    public void setTravelAgencyname(String TravelAgencyname) {
        this.TravelAgencyname = TravelAgencyname;
    }

    public AllAirliner getAllairliner() {
        return allairliner;
    }

    public void setAllairliner(AllAirliner allairliner) {
        this.allairliner = allairliner;
    }

    public MasterSchedule getMasterschedule() {
        return masterschedule;
    }

    public void setMasterschedule(MasterSchedule masterschedule) {
        this.masterschedule = masterschedule;
    }

    public CustomerDirectory getCustomerdirectory() {
        return customerdirectory;
    }

    public void setCustomerdirectory(CustomerDirectory customerdirectory) {
        this.customerdirectory = customerdirectory;
    }
    
    
    
}