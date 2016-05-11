package com.sd.w10;

public class HomeTheaterTestDrive {
  public static void main(String[] args){
    Amplifier amp=new Amplifier("Amplifier");
      Tuner tuner=new Tuner("Tuner",amp);
      DvdPlayer dvd=new DvdPlayer("DvdPlayer",amp);
      Projector projector=new Projector("Projector",dvd);
      
      HTFacade ht=new HTFacade(amp,tuner,dvd,projector);
      ht.watchMoive("WatchMoive");
      ht.endMoive();
  }
}