import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MultiThread4 extends JFrame implements Runnable{
   static Thread th;
    
//Runnable�� Ŭ���� �ϳ��� ���� ����!
   JLabel jb;
   JButton btn1, btn2;
   
   MultiThread4(){
      setTitle("������ ����");
      setSize(500, 500);
      Container c = getContentPane();
      c.setLayout(new FlowLayout());
      
      jb = new JLabel("1");
      jb.setFont(new Font("����",Font.BOLD, 100));
      jb.setForeground(Color.DARK_GRAY);
      c.add(jb);
      
      btn1 = new JButton("STOP");
      btn1.setForeground(Color.white);
      btn1.setBackground(Color.black);
      c.add(btn1);
      
      btn2 = new JButton("START");
      btn2.setForeground(Color.white);
      btn2.setBackground(Color.black);
      c.add(btn2);
      
      btn1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton bt = (JButton)e.getSource();
            th.interrupt();
             
         }
      });
      btn2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton bt = (JButton)e.getSource();
            th.start();
         }
      });
       
      
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
   }
   int x = 1;
   public void run(){
      while(true) {
         System.out.println(x+"��° ������ YO!");
         jb.setText(Integer.toString(x));
          
         x++;
         try { 
            Thread.sleep(1000); 
            //Thread�� extends���� ��ӵǹǷ� implements������ Thread. �����
         }catch(InterruptedException e){ 
            System.exit(0); 
         }
      }
   }
 
   
   public static void main(String[] args) {

      MultiThread4 t = new MultiThread4();
      th = new Thread(t);  
   }

}