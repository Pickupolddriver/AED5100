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
       F1.setFlightID("Flight1");
       F2.setFlightID("Flight2");
       F3.setFlightID("Flight3");
       F4.setFlightID("Flight4");
       F5.setFlightID("Flight5");
       F6.setFlightID("Flight6");
       
       
       
       
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

        
        
        
       FlightSchedule flightsche1=ta1.getMasterschedule().getMasterSchedule().get(0);
       Flight fligh0=flightsche1.getFlightSchedule().get(0);
       int ax=fligh0.getFlightrevenue();
       String id0=fligh0.getFlightID();
       String dep0=fligh0.getDeparture();
       String des0=fligh0.getDestination();
        
       Flight fligh1=flightsche1.getFlightSchedule().get(1);
       int bx=fligh1.getFlightrevenue();
       String id1=fligh1.getFlightID();
       String dep1=fligh1.getDeparture();
       String des1=fligh1.getDestination();
       
       
       FlightSchedule flightsche2=ta1.getMasterschedule().getMasterSchedule().get(1);
       Flight fligh2=flightsche2.getFlightSchedule().get(0);
       int cx=fligh2.getFlightrevenue();
       String id2=fligh2.getFlightID();
       String dep2=fligh2.getDeparture();
       String des2=fligh2.getDestination();
       
       Flight fligh3=flightsche2.getFlightSchedule().get(1);
       int dx=fligh3.getFlightrevenue();
       String id3=fligh3.getFlightID();
       String dep3=fligh3.getDeparture();
       String des3=fligh3.getDestination();
       
       FlightSchedule flightsche3=ta1.getMasterschedule().getMasterSchedule().get(2);
       Flight fligh4=flightsche3.getFlightSchedule().get(0);
       int ex=fligh4.getFlightrevenue();
       String id4=fligh4.getFlightID();
       String dep4=fligh4.getDeparture();
       String des4=fligh4.getDestination();
       
       
       FlightSchedule flightsche4=ta1.getMasterschedule().getMasterSchedule().get(2);
       Flight fligh5=flightsche4.getFlightSchedule().get(1);
       int fx=fligh5.getFlightrevenue();
       String id5=fligh5.getFlightID();
       String dep5=fligh5.getDeparture();
       String des5=fligh5.getDestination();
      //int seatpz1=fligh0.getSeatarray().getSeatArraylist().get(0).getPrice();
        
      System.out.println("FlightID  "+id0+" from "+dep0+" to "+ des0+" total revenue="+ax);
      System.out.println("FlightID  "+id1+" from "+ dep1+" to "+ des1+" total revenue="+bx);
      System.out.println("FlightID  "+id2+" from "+ dep2+" to "+ des2+" total revenue="+cx);
      System.out.println("FlightID  "+id3+" from "+ dep3+" to "+ des3+" total revenue="+dx);
      System.out.println("FlightID  "+id4+" from "+ dep4+" to "+ des4+" total revenue="+ex);
      System.out.println("FlightID  "+id5+" from "+ dep5+" to "+ des5+" total revenue="+fx);
      //total revenue per flight;I have 6 Flight form F1 to F6
       
      
     Airliner x1=ta1.getAllairliner().getAllAirliner().get(0);
     String x1_name=x1.getNameOfAirliner();
     int sumx1=x1.getAirlinerRevenue();
     System.out.println("Airliner: "+x1_name+"'s total revenue is  "+sumx1);
    
        
    
     Airliner x2=ta1.getAllairliner().getAllAirliner().get(1);
     String x2_name=x2.getNameOfAirliner();
     int sumx2=x2.getAirlinerRevenue();
     System.out.println("Airliner: "+x2_name+"'s total revenue is  "+sumx2);
    
     
     Airliner x3=ta1.getAllairliner().getAllAirliner().get(2);
     String x3_name=x3.getNameOfAirliner();
     int ffd=x3.getAirlinerRevenue();
     System.out.println("Airliner: "+x3_name+"'s total revenue is  "+ffd);
     
     
     
       
        int ReveneuOfAllAirliner=ta1.getAllairliner().getSumofAllairliner();
     System.out.println("All Airliners' total revenue is  "+ReveneuOfAllAirliner);
     
     
     
    }
        
    } 

