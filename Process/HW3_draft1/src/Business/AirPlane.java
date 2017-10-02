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
public class AirPlane {
    private String airliner;
    private String manufacturer;
    private String modelnumber;
    private int NumberOfSeats=150;
    private int serialnumber;//the only ID of the flight

    public String getAirliner() {
        return airliner;
    }

    public void setAirliner(String airliner) {
        this.airliner = airliner;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModelnumber() {
        return modelnumber;
    }

    public void setModelnumber(String modelnumber) {
        this.modelnumber = modelnumber;
    }

    public int getNumberOfSeats() {
        return NumberOfSeats;
    }

    public void setNumberOfSeats(int NumberOfSeats) {
        this.NumberOfSeats = NumberOfSeats;
    }

    public int getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(int serialnumber) {
        this.serialnumber = serialnumber;
    }
  
    

   
}
