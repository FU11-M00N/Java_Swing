import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Test1.JPanelE.MyThread;

public class Test2 extends JFrame {
	JLabel J1,J2;
	Test2(){
		
		setTitle("������2");
		setSize(500,400);
		
		
		Container c =getContentPane();
		
		c.add(new South(),BorderLayout.SOUTH);
		c.add(new Center(),BorderLayout.CENTER);
		c.add(new EAST(),BorderLayout.EAST);
		c.add(new WEST(),BorderLayout.WEST);
		c.add(new NORTH(),BorderLayout.NORTH);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	class Center extends JPanel{
		Thread t;
		Center(){
			setBackground(new Color(0x00ff00));
			J1 = new JLabel(calc());
			J1.setFont(new Font("�ü�",Font.BOLD,70));
			add(J1);
			addMouseListener(new Mymouse());
			
		}
		
		
		class Mymouse extends MouseAdapter{
		
			public void mouseClicked(MouseEvent e){ //���콺Ŭ��
				t= new MyThread();
				t.start();
			}
			public void mouseExited(MouseEvent e){ //������Ʈ�� �������ö�         
				
				t.interrupt();
			}
		}
		
		public String calc() {
			
			Calendar cd = Calendar.getInstance();
			int hour = cd.get(Calendar.HOUR_OF_DAY);
			int miunte = cd.get(Calendar.MINUTE);
			int seconde = cd.get(Calendar.SECOND);
			
			
			String text=" ";
			text += text.concat(Integer.toString(hour)+":")+text.concat(Integer.toString(miunte)+":")+text.concat(Integer.toString(seconde));
			
			return text;
			
		}
		class MyThread extends Thread{
			public void run() {
				int k=0;
				while(true) {
					J1.setText(calc());
					try {
						sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						return ;
					} //1��
				}
			}
		}
	}
	
	
	class South extends JPanel{
		South(){
			setBackground(new Color(0x2325ff));
		}
	}
	
	class EAST extends JPanel{
		EAST(){
			setBackground(new Color(0x2325ff));
		}
	}
	
	class NORTH extends JPanel{
		NORTH(){
			setBackground(new Color(0x2325ff));
		}
	}
	
	class WEST extends JPanel{
		WEST(){
			setBackground(new Color(0x2325ff));
		}
	}
	
	public static void main(String[] args) {
		new Test2();

	}

}
