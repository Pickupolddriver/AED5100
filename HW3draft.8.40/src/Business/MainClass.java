/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Business.Flight;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.*;

/**
 *
 * @author lijianxi
 */
public class MainClass {
    public static void main(String args[]) { 
       TravelAgency ta1=new TravelAgency();
       AllAirliner allairliners=new AllAirliner();
       MasterSchedule ms=new MasterSchedule();
       
       CustomerDirectory customerdirectory=new CustomerDirectory();
       
       Airliner DL=new Airliner();
       Airliner CA=new Airliner();
       Airliner CZ=new Airliner();
      //3 Airliners'
      DL.setNameOfAirliner("Delta");
      CA.setNameOfAirliner("ChinaAirline");
      CZ.setNameOfAirliner("ChinaSouthAirline");
      
       
       AirPlane AP1=new AirPlane();
       AirPlane AP2=new AirPlane();
       AirPlane AP3=new AirPlane();
       AirPlane AP4=new AirPlane();
       AirPlane AP5=new AirPlane();
       AirPlane AP6=new AirPlane();
       //6 AirPlane Each Airliner have 2 Airplane
       AP1.setAirliner("Delta");
       AP2.setAirliner("Delta");
       AP3.setAirliner("ChinaAirline");
       AP4.setAirliner("ChinaAirline");
       AP5.setAirliner("ChinaSouthAirline");
       AP6.setAirliner("ChinaSouthAirline");
       int sn=5555;
       AP1.setSerialnumber(sn);
       AP2.setSerialnumber(sn+1);
       AP3.setSerialnumber(sn+2);
       AP4.setSerialnumber(sn+3);
       AP5.setSerialnumber(sn+4);
       AP6.setSerialnumber(sn+5);
       int mnum=707;
       AP1.setModelnumber(mnum);
       AP2.setModelnumber(mnum+10);
       AP3.setModelnumber(mnum+20);
       AP4.setModelnumber(mnum+30);
       AP5.setModelnumber(mnum+40);
       AP6.setModelnumber(mnum+50);
       String be="Boeing";
       AP1.setManufacturer(be);
       AP2.setManufacturer(be);
       AP3.setManufacturer(be);
       AP4.setManufacturer(be);
       AP5.setManufacturer(be);
       AP6.setManufacturer(be);
       
      
       Flight F1=new Flight();
       Flight F2=new Flight();
       Flight F3=new Flight();
       Flight F4=new Flight();
       Flight F5=new Flight();
       Flight F6=new Flight();
       F1.setDeparture("LAX");
       F2.setDeparture("BOS");
       F3.setDeparture("PEK");
       F4.setDeparture("PVG");
       F5.setDeparture("HKG");
       F6.setDeparture("SFO");
       F1.setDestination("NYC");
       F2.setDestination("PVG");
       F3.setDestination("CAN");
       F4.setDestination("LAX");
       F5.setDestination("MIA");
       F6.setDestination("DLA");
       
       
       
       
       Person P1=new Person();
       Person P2=new Person();
       Person P3=new Person();
       Person P4=new Person();
       Person P5=new Person();
       Person P6=new Person();
       Person P7=new Person();
       Person P8=new Person();
       Person P9=new Person();
       P1.setName("Justin");
       P2.setName("Biber");
       P3.setName("Jon");
       P4.setName("Snow");
       P5.setName("Danny");
       P6.setName("Chris");
       P7.setName("Chan");
       P8.setName("West");
       P9.setName("Brook");
       P1.setPersonID(1);
       P2.setPersonID(2);
       P3.setPersonID(3);
       P4.setPersonID(4);
       P5.setPersonID(5);
       P6.setPersonID(6);
       P7.setPersonID(7);
       P8.setPersonID(8);
       P9.setPersonID(9);
       
      customerdirectory.addPerson(P1);
      customerdirectory.addPerson(P2);
      customerdirectory.addPerson(P3);
      customerdirectory.addPerson(P4);
      customerdirectory.addPerson(P5);
      customerdirectory.addPerson(P6);
      customerdirectory.addPerson(P7);
      customerdirectory.addPerson(P8);
      customerdirectory.addPerson(P9);
      
      
    
       
       Seat S1=new Seat();
       Seat S2=new Seat();
       Seat S3=new Seat();
       Seat S4=new Seat();
       Seat S5=new Seat();
       Seat S6=new Seat();
       Seat S7=new Seat();
       Seat S8=new Seat();
       Seat S9=new Seat();
       S1.setColum(1);
       S2.setColum(2);
       S3.setColum(3);
       S4.setColum(4);
       S5.setColum(5);
       S6.setColum(6);
       S7.setColum(1);
       S8.setColum(2);
       S9.setColum(3);
       S1.setRow(1);
       S2.setRow(2);
       S3.setRow(3);
       S4.setRow(4);
       S5.setRow(5);
       S6.setRow(6);
       S7.setRow(7);
       S8.setRow(8);
       S9.setRow(9);
       int pz=110;
       S1.setPrice(pz+1);
       S2.setPrice(pz+2);
       S3.setPrice(pz+3);
       S4.setPrice(pz+4);
       S5.setPrice(pz+5);
       S6.setPrice(pz+6);
       S7.setPrice(pz+7);
       S8.setPrice(pz+8);
       S9.setPrice(pz+9);
       S1.setPerson(P1);
       S2.setPerson(P2);
       S3.setPerson(P3);
       S4.setPerson(P4);
       S5.setPerson(P5);
       S6.setPerson(P6);
       S7.setPerson(P7);
       S8.setPerson(P8);
       S9.setPerson(P9);
       
       SeatArraylist SAl1=new SeatArraylist();
       SeatArraylist SAl2=new SeatArraylist();
       SeatArraylist SAl3=new SeatArraylist();
       SeatArraylist SAl4=new SeatArraylist();
       SeatArraylist SAl5=new SeatArraylist();
       SeatArraylist SAl6=new SeatArraylist();
      
       SAl1.addSeat(S1);
       SAl2.addSeat(S2);
       SAl3.addSeat(S3);
       SAl4.addSeat(S4);
       SAl5.addSeat(S5);
       SAl6.addSeat(S6);
       SAl1.addSeat(S7);
       SAl2.addSeat(S8);
       SAl3.addSeat(S9);
       
       F1.setSeatarray(SAl1);
       F2.setSeatarray(SAl2);
       F3.setSeatarray(SAl3);
       F4.setSeatarray(SAl4);
       F5.setSeatarray(SAl5);
       F6.setSeatarray(SAl6);
       F1.setSeatarray(SAl1);
       F2.setSeatarray(SAl2);
       F3.setSeatarray(SAl3);
       
       F1.setAirplane(AP1);
       F2.setAirplane(AP2);
       F3.setAirplane(AP3);
       F4.setAirplane(AP4);
       F5.setAirplane(AP5);
       F6.setAirplane(AP6);
       
       
       
       Fleet Fl1=new Fleet();
       Fleet Fl2=new Fleet();
       Fleet Fl3=new Fleet();
       
       Fl1.addAirplanes(AP1);
       Fl1.addAirplanes(AP2);
       Fl2.addAirplanes(AP3);
       Fl2.addAirplanes(AP4);
       Fl3.addAirplanes(AP5);
       Fl3.addAirplanes(AP6);
       
      
       FlightSchedule FS1=new FlightSchedule();
       FlightSchedule FS2=new FlightSchedule();
       FlightSchedule FS3=new FlightSchedule();
       
       FS1.addFlight(F1);
       FS1.addFlight(F2);
       FS2.addFlight(F3);
       FS2.addFlight(F4);
       FS3.addFlight(F5);
       FS3.addFlight(F6);
       
       /*Airliner DL=new Airliner();
       Airliner CA=new Airliner();
       Airliner CZ=new Airliner();*/
       
       DL.setFleet(Fl1);
       CA.setFleet(Fl2);
       CZ.setFleet(Fl3);
       
       DL.setFs(FS1);
       CA.setFs(FS2);
       CZ.setFs(FS3);
       
        allairliners.addAirliner(DL);
        allairliners.addAirliner(CA);
        allairliners.addAirliner(CZ);
        
       ms.addMasterSchedule(FS1);
       ms.addMasterSchedule(FS2);
       ms.addMasterSchedule(FS3);
       
       ta1.setAllairliner(allairliners);
       ta1.setCustomerdirectory(customerdirectory);
       ta1.setMasterschedule(ms);

        
        
        
       FlightSchedule flightsche1=ta1.masterschedule.getMasterSchedule().get(1);
       
      
        
      
        
        
        
        
    }
        
        
    } 

