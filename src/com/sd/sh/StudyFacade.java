package com.sd.sh;

public class StudyFacade {
  private Book book;
  private Door door;
  private Pencil pencil;
  public StudyFacade(Book book,Door door,Pencil pencil){
    this.book=book;
    this.door=door;
    this.pencil= pencil;
  }
  public void startStudy(String study){
    System.out.println("Get ready to start study....");
    book.open();
    door.close();
    pencil.pick();
  }
  public void endStudy(){
    System.out.println("End study...");
    book.close();
    door.open();
    pencil.put();
  }
}