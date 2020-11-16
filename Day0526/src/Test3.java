import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
/*class MyAction1 implements ActionListener{
   
   public void actionPerformed(ActionEvent e) {
      JButton bts = (JButton)e.getSource();
      if(bts.getText().equals("오렌지")) {
         bts.setText("Orange");
      }
      else if(bts.getText().equals("사과")) {
         bts.setText("Apple");
      }
      else {
         bts.setText("맛있당");
      }
   }
}*/
public class Test3 extends JFrame implements ActionListener{
   JTextField t;
   int x;
   public void actionPerformed(ActionEvent e) {
      JButton bts = (JButton)e.getSource();
      x= Integer.parseInt(t.getText());
      if(bts.getText().equals("오렌지")) {
         bts.setText("Orange");
      }
      else if(bts.getText().equals("사과")) {
         t.setText(""+(x+5));
      }
      else {
         bts.setText("맛있당");
      }
   }
   Test3(){
      setTitle("이벤트");
      setSize(500,400);
      
      Container c = getContentPane();
      c.setBackground(Color.yellow);
      setLayout(new FlowLayout());
      JButton b1 = new JButton("오렌지");
      b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
         JButton bts = (JButton)e.getSource();
         if(bts.getText().equals("오렌지")) {
            bts.setText("Orange");
         }
         else if(bts.getText().equals("사과")) {
            bts.setText("Apple");
         }
         else {
            bts.setText("맛있당");
         }
      }}
            );
      
      
      //b1.addActionListener(new MyAction1());
      //b1.addActionListener(new MyAction2());
      JButton b2 = new JButton("사과");
      //b2.addActionListener(new MyAction1());
      //b2.addActionListener(new MyAction2());
      b2.addActionListener(this); //내 클래스
      c.add(b1);c.add(b2);
      c.add(new JTextField(10));
      
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
   
   public static void main(String[] args) {
      new Test3();

   }
   
   //내부 클래스 개념 처음 설명함!!! 클래스 안에 클래스, 클래스,,, 할 수 있음
   class MyAction2 implements ActionListener{
      public void actionPerformed(ActionEvent e) {
         JButton bts = (JButton)e.getSource();
         
         if(bts.getText().equals("오렌지")) {
            bts.setText("Orange");
         }
         else if(bts.getText().equals("사과")) {
            bts.setText("Apple");
         }
         else {
            bts.setText("맛있당");
         }
      }
   }

} 