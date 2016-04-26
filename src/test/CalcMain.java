package test;

import java.util.*;

public class CalcMain{
    public static void main(String[] args){
       Scanner i= new Scanner(System.in);
       System.out.println("num1,num2");
       int num1=i.nextInt();
       int num2=i.nextInt();  
       int res;
       char sol=i.next().charAt(0);
       Calc c=new Calc();
       
       if(sol=='+')
       {
         res=c.add(num1,num2);
         System.out.println(res);
       }
       else{
         System.out.println("Eorror");
  }
    }
}
  

