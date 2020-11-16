import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

import test.MyKey;



public class 홍은비_2019202150_2_B extends JFrame{

   
   Container c;
   JLabel jl[]= new JLabel[4];
   JLabel jl2,jl3;
   String jlstr[]= {"이름","성별","키","몸무게"};
   JTextField jf[]= new JTextField[4];
   JMenuItem newFile,open,save,namesave,qq;
   String name="";
   int weight=0;
   
   
   홍은비_2019202150_2_B(){
      setTitle("2-B반 기말테스트1");
      setSize(500,500);
      menu();
      c = getContentPane();
      c.setLayout(null);
      
      for(int i=0;i<jl.length;i++) {
         jl[i]= new JLabel(jlstr[i]);
         jf[i] = new JTextField(10);
         jl[i].setBounds(100, (i+1)*50, 100, 30);
         jf[i].setBounds(200, (i+1)*50, 100, 30);
         
         if(i==3) {
            jf[i].addKeyListener(new MyAction3());
         }
         c.add(jl[i]);
         c.add(jf[i]);
         
      }
      
      jl2 = new JLabel("입력하세요.");
      jl2.setBounds(150,300,200,30);
      jl3 = new JLabel("선택 : ");
      jl3.setBounds(150,350,140,30);
      
      c.add(jl2); c.add(jl3);
      jf[3].setFocusable(true);
      jf[3].requestFocus();
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      setVisible(true);
   }
   void menu() {
      JMenuBar mb = new JMenuBar();
      JMenu file = new JMenu("파일(F)");
      JMenu edit = new JMenu("편집(E)");
      JMenu view = new JMenu("보기(V)");
      JMenu help = new JMenu("도움말(H)");
      newFile = new JMenuItem("새로 만들기(N)");
      open = new JMenuItem("열기(O)");
      save = new JMenuItem("저장(S)");
      namesave = new JMenuItem("다른이름으로 저장(V)");
      qq= new JMenuItem("나가기(Q)");
      newFile.addActionListener(new MyAction());
      open.addActionListener(new MyAction());
      save.addActionListener(new MyAction());
      namesave.addActionListener(new MyAction());
      qq.addActionListener(new MyAction());
      mb.add(file); mb.add(edit);mb.add(view);mb.add(help);
      file.add(newFile);file.add(open);file.add(save);
      file.add(namesave);file.add(qq);
      setJMenuBar(mb);
   }
   
   
   public static void main(String[] args) {
      new 홍은비_2019202150_2_B();

   }
   class MyAction implements ActionListener{
      public void actionPerformed(ActionEvent e) {
         String n = e.getActionCommand(); //사용자가 선택한 메뉴아이템을 리턴
         if(n.equals("나가기(Q)")) {
            System.exit(0);
         }
         if(n.equals("새로 만들기(N)")) {
            System.out.println(jl3.getText());
            jl3.setText("새로 만들기(N)를 선택");
         }
         if(n.equals("열기(O)")) {
            jl3.setText("열기(O)를 선택");
         }
         if(n.equals("저장(S)")) {
            jl3.setText("저장(S)를 선택");
         }
         if(n.equals("다른이름으로 저장(V)")) {
            jl3.setText("다른이름으로 저장(V)를 선택");
         }
      }
   }
   
   class MyAction3 extends KeyAdapter{
      int weight2=0;
      public void keyPressed(KeyEvent e) {
         String name2=jl2.getName();
         int key = e.getKeyChar();
         int keys = e.getKeyCode();
         weight2=(int)((Integer.parseInt(jf[3].getText())-100)*0.9);
         if(keys==KeyEvent.VK_ENTER) {
               jl2.setText(name2+"님의 평균 몸무게는"+Integer.toString(weight2));
         }
      }
   }
}