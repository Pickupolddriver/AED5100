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
public class Vehicle {

    private String manufacturer;
    private int manufactureyear;
    private String model;
    private int seatnumber;
    private String serialnumber;
    private Date expiredDate;
    private Date updatedate;
    private Boolean available;
    private Double latitue;
    private Double longitude;
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeatnumber() {
        return seatnumber;
    }

    public void setSeatnumber(int seatnumber) {
        this.seatnumber = seatnumber;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = sdf.parse(expiredDate);
        try {
            startDate = sdf.parse(expiredDate);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        this.expiredDate = startDate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(String updatedate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = sdf.parse(updatedate);
        try {
            startDate = sdf.parse(updatedate);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        this.updatedate = startDate;

    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Double getLatitue() {
        return latitue;
    }

    public void setLatitue(Double latitue) {
        this.latitue = latitue;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return this.serialnumber;
    }

}
