/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author lijianxi
 */
public class airplane {
    private String airliner;
    private String manufacturer;
    private int manufactureyear;
    private String modelnumber;
    private int seatnumber;
    private int serialnumber;
    private String expired;
    private Date updatedate;
    private String avalable;

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

    public int getManufactureyear() {
        return manufactureyear;
    }

    public void setManufactureyear(int manufactureyear) {
        this.manufactureyear = manufactureyear;
    }

    public String getModelnumber() {
        return modelnumber;
    }

    public void setModelnumber(String modelnumber) {
        this.modelnumber = modelnumber;
    }

    public int getSeatnumber() {
        return seatnumber;
    }

    public void setSeatnumber(int seatnumber) {
        this.seatnumber = seatnumber;
    }

    public int getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(int serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getExpired() {
        return expired;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(String updatedate) throws ParseException {
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
        Date startDate= df.parse(updatedate);
        try {
                startDate = df.parse(updatedate);
                
                
            } 
        catch (ParseException e) 
            {
                e.printStackTrace();
            }

        this.updatedate = startDate;
        
    }

   

  

    public String getAvalable() {
        return avalable;
    }

    public void setAvalable(String avalable) {
        this.avalable = avalable;
    }

   
}
