import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class MultiThread3 extends JFrame {
   JLabel jb;
   MultiThread3(){
      
        setTitle("쓰레드 연습");
         setSize(400,500);
         Container c= getContentPane();
         jb = new JLabel("1");
         jb.setFont(new Font("궁서",Font.ITALIC,200));
         jb.setForeground(Color.red);
         c.add(jb);
         c.setLayout(new FlowLayout());
         MyThread th = new MyThread();
         th.start();
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setVisible(true);
   }
   
   class MyThread extends Thread{
      int x=1;
      
      public void run() {
         while(true) {
         System.out.println(x+"번째 쓰레드");
         jb.setText(Integer.toString(x));
         x++;
         try {
            Thread.sleep(1000);
         }catch(InterruptedException e) {
            System.exit(0);
         }
         

         }
      }
   }
   
   public static void main(String[] args) {
      new MultiThread3();
      
   }

}