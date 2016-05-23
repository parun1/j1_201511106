package com.sd.w10;

public class HTFacade {
  private Amplifier amp;
  private Tuner tuner;
  private DvdPlayer dvd;
  private Projector projector;
  public HTFacade(Amplifier amp,Tuner tuner,DvdPlayer dvd,Projector projcetor){
    this.amp=amp;
    this.tuner=tuner;
    this.dvd=dvd;
    this.projector=projcetor;
  }
  public void watchMoive(String movie){
    System.out.println("Get ready to watch a moive....");
    projector.on();
    projector.wideScreenMode();
    amp.on();
    amp.setDvd(dvd);
    amp.setVolume(5);
    dvd.on();
    dvd.play(movie);
  }
  public void endMoive(){
    System.out.println("Shutting off...");
    projector.off();
    amp.off();
    dvd.Stop();
    dvd.eject();
    dvd.off();
  }
}