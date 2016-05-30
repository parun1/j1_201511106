package com.sd.w12.state;

public class GumballMachine {
  int count =0;
  final static int SOLD_OUT=0;
  final static int NO_QUARTER=1;
  final static int HAS_QUARTER=2;
  final static int SOLD=3;
  
  int state=SOLD_OUT;
  public GumballMachine(int count){
    this.count=count;
    if(count>0) {
      state=NO_QUARTER;
    }
  }
  public void insertQuarter(){
    if(state==HAS_QUARTER){
       System.out.print("You can not insert another quarter");
    }
    else if (state==NO_QUARTER){
       state=HAS_QUARTER;
       System.out.print("You inserted another quarter");
       }
       else if (state==SOLD_OUT){
       System.out.print("You can not insert,SOLD OUT");
       }
         else if (state==SOLD){
         System.out.print("wait, we already given a gumball");
         }
  }
  public void ejectQuarter(){
    if(state==HAS_QUARTER){
      state=NO_QUARTER;
       System.out.print("Quarter returned");
    }
       else if (state==NO_QUARTER){
       System.out.print("You haven't inserted a quarter");
       }
       else if (state==SOLD_OUT){
       System.out.print("You can not eject, you haven't inserted a quarater yet");
       }
         else if (state==SOLD){
         System.out.print("Sorry you already turned the crank");
         }
  }
  public void turnCrank(){
    if(state==SOLD){
       System.out.print("Turning twice dosen't get you another gumball!");
    }
       else if (state==NO_QUARTER){
       System.out.print("You turned but there's no quarter");
       }
       else if (state==SOLD_OUT){
       System.out.print("You turned, but there are no gumballs");
       }
         else if (state==HAS_QUARTER){
         System.out.print("You turned..");
         state=SOLD;
         dispense();
         }
  }
  public void dispense(){
  if(state==SOLD){
       System.out.print("A gumball comes rolling out the slot");
       count =count -1;
       if(count ==0) {
         System.out.println("Oops, out of gumballs!");
         state = SOLD_OUT;
       }
       else{
         state=NO_QUARTER;
       }
    }
       else if (state==NO_QUARTER){
       System.out.print("You need to pay first");
       }
       else if (state==SOLD_OUT){
       System.out.print("No gumball dispensed");
       }
         else if (state==HAS_QUARTER){
         System.out.print("No gumball dispensed");
         }
  
  }
  
}
  
  