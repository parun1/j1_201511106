package com.sd.sh;

public class StudyTestDrive {
  public static void main(String[] args){
    Book book=new Book("book");
      Door door=new Door("door");
      Pencil pencil=new Pencil("pencil");
      
      StudyFacade st=new StudyFacade(book,door,pencil);
      st.startStudy("startStudy");
      st.endStudy();
  }
}