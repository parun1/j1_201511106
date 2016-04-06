/*
 * @author pbj
 * @since 160404
 * demo how to use file decorator
 * 
 */


package com.sd.w5;
import java.io.File;
import java.io.FileInputStream;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.BufferedReader;



public class FileDemoMain {
  public static void main(String[] args) throws Exception {
    File readme= null;
    FileInputStream isReadme = null;
   BufferedReader brReadme = null;
    InputStreamReader isrReadme = null;
    String str;
    StringBuffer sbuffer=new StringBuffer();
    try {
      int i;
      char c;
     
      File myhome=new File(System.getProperty("user.home"));
      System.out.println("my home" +myhome);
      
      String cwd=new File("src/").getCanonicalPath();
      System.out.println("cwd is"+cwd);
      
      readme=new File(cwd,"HelloWorld.java");
      System.out.println("readme is"+readme);
    
      isReadme =new FileInputStream(readme);
      while((i=isReadme.read())!=-1) {
        c=(char)i;
        System.out.print(c);
      }
     
      }catch(Exception e) {
        e.printStackTrace();
      }finally{
        if(isReadme !=null)
          isReadme.close();
      }
      try{
     
        isReadme=new FileInputStream(readme);
       isrReadme=new InputStreamReader(isReadme,"UTF8");
         brReadme= new BufferedReader(isrReadme);
            while((str=brReadme.readLine())!=null) {
                System.out.println("--"+str);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(brReadme != null)
                brReadme.close();
        }
    }
      }
  
     

 