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
      if(bts.getText().equals("������")) {
         bts.setText("Orange");
      }
      else if(bts.getText().equals("���")) {
         bts.setText("Apple");
      }
      else {
         bts.setText("���ִ�");
      }
   }
}*/
public class Test3 extends JFrame implements ActionListener{
   JTextField t;
   int x;
   public void actionPerformed(ActionEvent e) {
      JButton bts = (JButton)e.getSource();
      x= Integer.parseInt(t.getText());
      if(bts.getText().equals("������")) {
         bts.setText("Orange");
      }
      else if(bts.getText().equals("���")) {
         t.setText(""+(x+5));
      }
      else {
         bts.setText("���ִ�");
      }
   }
   Test3(){
      setTitle("�̺�Ʈ");
      setSize(500,400);
      
      Container c = getContentPane();
      c.setBackground(Color.yellow);
      setLayout(new FlowLayout());
      JButton b1 = new JButton("������");
      b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
         JButton bts = (JButton)e.getSource();
         if(bts.getText().equals("������")) {
            bts.setText("Orange");
         }
         else if(bts.getText().equals("���")) {
            bts.setText("Apple");
         }
         else {
            bts.setText("���ִ�");
         }
      }}
            );
      
      
      //b1.addActionListener(new MyAction1());
      //b1.addActionListener(new MyAction2());
      JButton b2 = new JButton("���");
      //b2.addActionListener(new MyAction1());
      //b2.addActionListener(new MyAction2());
      b2.addActionListener(this); //�� Ŭ����
      c.add(b1);c.add(b2);
      c.add(new JTextField(10));
      
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
   
   public static void main(String[] args) {
      new Test3();

   }
   
   //���� Ŭ���� ���� ó�� ������!!! Ŭ���� �ȿ� Ŭ����, Ŭ����,,, �� �� ����
   class MyAction2 implements ActionListener{
      public void actionPerformed(ActionEvent e) {
         JButton bts = (JButton)e.getSource();
         
         if(bts.getText().equals("������")) {
            bts.setText("Orange");
         }
         else if(bts.getText().equals("���")) {
            bts.setText("Apple");
         }
         else {
            bts.setText("���ִ�");
         }
      }
   }

} 