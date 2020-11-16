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

public class SwingEvent2 extends JFrame{

   JLabel jb = new JLabel("선택");
   Container c;
   JMenuItem newFile;
   JMenuItem bcolor;
   
   SwingEvent2(){
      setTitle("메뉴 만들기");
      setSize(500,500);
      c = getContentPane();
      c.setLayout(null);
      c.setBackground(Color.white);
      jb.setBounds(150,80,300,50);
      jb.setForeground(Color.blue);
      jb.setFont(new Font("궁서체",Font.BOLD,25));
      c.add(jb);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      menu();
      setVisible(true);
   }
   void menu() {
      JMenuBar mb = new JMenuBar();
      JMenu file = new JMenu("파일");
      JMenu edit = new JMenu("편집");
      JMenu option = new JMenu("서식");
      JMenu view = new JMenu("보기");
      JMenu help = new JMenu("도움말");
      newFile = new JMenuItem("새로 만들기");
      bcolor = new JMenuItem("배경색");
      mb.add(file); mb.add(edit);mb.add(option);mb.add(view);mb.add(help);
      file.add(newFile);file.add(bcolor);
      newFile.addActionListener(new MyAction());
      bcolor.addActionListener(new MyAction());
      file.addSeparator();
      file.add(new JMenuItem("새 창")).addActionListener(new MyAction());
      setJMenuBar(mb);
   }
   class MyAction implements ActionListener{
      public void actionPerformed(ActionEvent e) {
         String n = e.getActionCommand(); //사용자가 선택한 메뉴아이템을 리턴
         if(n.equals("새 창")) {
            jb.setText(newFile.getText()+"를 선택");
         }else if(n.equals("배경색")) {
            c.setBackground(Color.yellow);
         }
      }
   }
   public static void main(String[] args) {
      new SwingEvent2();

   }

}