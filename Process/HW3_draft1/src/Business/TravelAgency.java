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
    AllAirliner allairliner;
    MasterSchedule masterschedule;
    CustomerDirectory customerdirectory;

    public TravelAgency() {
        allairliner=new AllAirliner();
        masterschedule=new MasterSchedule();
        customerdirectory=new CustomerDirectory();
    }
    
    
    
}