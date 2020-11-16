import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class DataData extends JFrame{
   JPanel jp, p1, p2,p3;
   String str[]= {"%","CE","C","X버튼","1/x","x^2","2 루트 x","/","7","8","9","x","4","5","6","-","1","2","3","+"
			,"+/-","0",".","="};
   Color c[]= {Color.red,Color.blue,Color.cyan,Color.lightGray};
   DataData(){
	   
      setTitle("나의 계산기");
      setSize(500,400);
      jp = new JPanel();
      jp.setLayout(new BorderLayout());
      p1 = new JPanel();
      p2 = new JPanel();
      p3= new JPanel();
      p2.setLayout(new GridLayout(6,4));      
      p1.setBackground(Color.MAGENTA);
      JLabel jb = new JLabel("입력 값: ");
      JLabel jb2 = new JLabel("결과 값: ");
      JTextField jf = new JTextField("0",10);
      JTextField jf2 = new JTextField("0",10);
      
      p1.add(jb); 
      p1.add(jf);
      p3.add(jb2); 
      p3.add(jf2);
      
      jp.add(p1,BorderLayout.NORTH);
      jp.add(p3,BorderLayout.SOUTH);
      for(int i =0;i<24;i++) {
    	   
    	  	setForeground(Color.c[i]);
			p2.add(new JButton(str[i]));
						
		}
      jp.add(p2,BorderLayout.CENTER);
      add(jp);
      
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
}
public class Test2 {

   public static void main(String[] args) {
      new DataData();
   }

}