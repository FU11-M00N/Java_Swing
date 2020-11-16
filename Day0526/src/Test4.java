import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Test4 extends JFrame{

   JTextField tt = new JTextField(10);
   int x =(int)(Math.random()*10+1);
   String xx = Integer.toString(x);
   int y =(int)(Math.random()*10+1);
   String yy = Integer.toString(y);
   public static void main(String[] args) {
      new Test4();

   }
   
   
   Test4(){
      setTitle("나의 계산기");
      setSize(200,500);
      setLayout(new FlowLayout());
      

      JLabel l1 = new JLabel("first value: ");
      JTextField t1 = new JTextField(xx,10);
      JLabel l2 = new JLabel("second value: ");
      JTextField t2 = new JTextField(yy,10);
      JLabel l3 = new JLabel("result value: ");
      JTextField t3 = new JTextField(10);
      add(l1);add(t1);
      add(l2);add(t2);
      add(l3);add(tt);

      
      JButton b1 = new JButton("C");
      JButton b2 = new JButton("+");
      JButton b3 = new JButton("-");
      JButton b4 = new JButton("*");
      JButton b5 = new JButton("/");
      b1.addActionListener(new MyAction2());
      b2.addActionListener(new MyAction2());
      b3.addActionListener(new MyAction2());
      b4.addActionListener(new MyAction2());
      b5.addActionListener(new MyAction2());
      add(b1);add(b2);add(b3);add(b4);add(b5);
      
      
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
   
   class MyAction2 implements ActionListener{
      public void actionPerformed(ActionEvent e) {
         JButton bts = (JButton)e.getSource();
         
         if(bts.getText().equals("C")) {
            tt.setText("o");
         }
         else if(bts.getText().equals("+")) {
            int result = Integer.parseInt(xx)+Integer.parseInt(yy);
            tt.setText(Integer.toString(result));
         }
         else if(bts.getText().equals("-")){
            int result = Integer.parseInt(xx)-Integer.parseInt(yy);
            tt.setText(Integer.toString(result));
         }
         else if(bts.getText().equals("/")){
             int result = Integer.parseInt(xx) / Integer.parseInt(yy);
             tt.setText(Integer.toString(result));
          }
         else if(bts.getText().equals("*")){
             int result = Integer.parseInt(xx)*Integer.parseInt(yy);
             tt.setText(Integer.toString(result));
          }
      }
   }
   
   
   

}


//x = Integer.parseInt(t.getText());
//if(bts.getText().equals("사과")) 
//t.setText(""+(x+5));
//jlabel , jtext