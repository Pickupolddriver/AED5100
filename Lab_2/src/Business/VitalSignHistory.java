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
public class VitalSignHistory {
    //a collection like an array which can store objects
    private ArrayList<VitalSigns> vitalSignHistory;

    public VitalSignHistory() 
    {
     vitalSignHistory= new ArrayList<VitalSigns>();   
    }

    
    //ArrayList can only store object rather than parameters;
    //ArrayList 只能存储对象但是不能存储基础类型
    public ArrayList<VitalSigns> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSigns> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    
    //we create the new 
    public VitalSigns addVitals()
    {
        //add a row in the arrayList?
        VitalSigns vs=new VitalSigns();
        vitalSignHistory.add(vs);
        return vs;
    }
    
    public void deleteVitals(VitalSigns v)
    {
        vitalSignHistory.remove(v);
    }
    
}
