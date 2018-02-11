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
public class Fleet {

    private String airliner;
    private ArrayList<Airplane> fleet;

    public String getAirliner() {
        return airliner;
    }

    public void setAirliner(String airliner) {
        this.airliner = airliner;
    }

    public Fleet() {
        fleet = new ArrayList<Airplane>();
    }

    public ArrayList getFleet() {
        return fleet;
    }

    public void setFleet(ArrayList fleet) {
        this.fleet = fleet;
    }

    public Airplane addAirplane() {
        Airplane ap = new Airplane();
        this.fleet.add(ap);
        return ap;
    }

    public void deleteAirplane(Airplane ap) {
        fleet.remove(ap);
    }

}
