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
public class VehicleHistory {

    private ArrayList<Vehicle> viechlehistory;

    public VehicleHistory() {
        viechlehistory = new ArrayList<Vehicle>();
    }

    public ArrayList<Vehicle> getViechlehistory() {
        return viechlehistory;
    }

    public void setViechlehistory(ArrayList<Vehicle> viechlehistory) {
        this.viechlehistory = viechlehistory;
    }

    public Vehicle addViechle() {
        Vehicle vc = new Vehicle();
        viechlehistory.add(vc);
        return vc;
    }

    public void deleteViechle(Vehicle vc) {
        viechlehistory.remove(vc);
    }

}
