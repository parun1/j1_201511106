import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Calc {
    public CalcKeyListener(){
      addKeyListener(new KeyAdapter(){
      public void keyPressed(KeyEvent e){
        int keyCode=e.getKeyCode();
        switch(keyCode){
          case KeyEvent.VK_0:
            add(0);
            break;
          case KeyEvent.VK_1:
            add(1);
            break;
          case KeyEvent.VK_2:
            add(2);
            break;
          case KeyEvent.VK_4:
            add(4);
            break;
          case KeyEvent.VK_5:
            add(5);
            break;
          case KeyEvent.VK_6:
            add(6);
            break;
            case KeyEvent.VK_7:
            add(7);
            break;
            case KeyEvent.VK_8:
            add(8);
            break;
            case KeyEvent.VK_9:
            add(9);
            break;
        }
      }
      });
        
  } 
}
public class CalcMain{
}
