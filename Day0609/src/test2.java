import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class test2 extends JFrame{

   JLabel jb = new JLabel("����");
   Container c;
   JMenuItem newFile;
   JMenuItem bcolor;
   JMenuItem save;
   JMenuItem other;
   JMenuItem exit;
   JMenuItem Open;
   test2(){
      setTitle("�޴� �����");
      setSize(500,500);
      c = getContentPane();
      c.setLayout(null);
      c.setBackground(Color.white);
      jb.setBounds(150,80,300,50);
      jb.setForeground(Color.blue);
      jb.setFont(new Font("�ü�ü",Font.BOLD,25));
      c.add(jb);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      menu();
      setVisible(true);
   }
   void menu() {
      JMenuBar mb = new JMenuBar();
      JMenu file = new JMenu("����");
      JMenu edit = new JMenu("����");
      JMenu option = new JMenu("����");
      JMenu view = new JMenu("����");
      JMenu help = new JMenu("����");
      newFile = new JMenuItem("���� �����(N)");
      Open = new JMenuItem("����");
      save = new JMenuItem("���� (O)");
      other = new JMenuItem("�ٸ��̸����� ����");
      exit = new JMenuItem("������");
      mb.add(file); 
      mb.add(edit);
      mb.add(option);
      mb.add(view);mb.add(help);
      file.add(newFile); file.add(Open);
      file.add(save); file.add(other); file.add(exit);
      newFile.addActionListener(new MyAction());
      bcolor.addActionListener(new MyAction());
      file.addSeparator();
      file.add(new JMenuItem("����")).addActionListener(new MyAction());
      setJMenuBar(mb);
      
      
   }
   
   
   class MyAction implements ActionListener{
      public void actionPerformed(ActionEvent e) {
         String n = e.getActionCommand(); //����ڰ� ������ �޴��������� ����
         if(n.equals("�� â")) {
            jb.setText(newFile.getText()+"�� ����");
         }else if(n.equals("����")) {
            c.setBackground(Color.yellow);
         }
      }
   }
   public static void main(String[] args) {
      new test2();

   }

}