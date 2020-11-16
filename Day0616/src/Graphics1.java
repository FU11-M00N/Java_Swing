import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphics1 extends JFrame{

   Graphics1(String str){
      super(str);
      setSize(400,500);
      setContentPane(new Myg());
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
   }
   
   class Myg extends JPanel{
      
      public void paintComponent(Graphics g) {
         super.paintComponent(g);
         g.setColor(Color.green);
         g.setFont(new Font("µ¸¿ò",Font.ITALIC,30));
         g.drawString("¿À´Ã¹¹ÇÏ´Â°ÅÁö", 10, 50);
         g.setColor(new Color(255,0,255)); //ÀÚÁÖ
         g.drawString("Á¦¹ß Å»È£¼­"
         		+ "", 20, 90);
         g.setColor(new Color(0x00ffff)); //ÇÏ´Ã
         g.drawString("¿À´Ã ¹¹¾ß", 30, 130);
         g.setColor(new Color(0x123456));
         g.drawLine(100, 200, 400, 400);
         g.drawRect(50, 50, 50, 50);
         g.setColor(Color.pink);
         g.drawOval(100, 150, 50, 90);
      
         g.setColor(new Color(0xffff00));
         g.drawRoundRect(150, 200, 100, 200, 30, 50);
         
         g.setColor(new Color(152,156,178));
         
         g.fillRect(200, 150, 100, 20);
         
         g.fillArc(300, 190, 50, 50, 0, 300);
         
         for(int i=1; i<=3; i++) {
        	 int n = (int)(Math.random()*255+1);
        	 int n2 = (int)(Math.random()*255+1);
        	 int n3 = (int)(Math.random()*255+1);
        	 
        	 
        	   g.setColor(new Color(n,n2,n3));
               g.fillArc(300*i, 190*i, 50*i, 50*i, 0, 300);
        	 
         }
      
         
      }
   }
   
//   public void paint(Graphics g) {
//      
//      super.paint(g); //ÀÌÀüÀÇ ÀÜ»ó Áö¿ì±â
//      g.setColor(Color.ORANGE);
//      g.drawString("¾È³çÇÏ¼¼¿ä", 100, 100);
//   }
   
   
   public static void main(String[] args) {
      new Graphics1("³ªÀÇ ±×¸²");
      
   }

}