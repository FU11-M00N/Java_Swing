import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class 문호준_2019201134 extends JFrame {
	JLabel J1,J2,J3;
	
	문호준_2019201134(){
		
		setTitle("두번째 2학년 기말테스트");
		setSize(550,750);
		
		
		Container c =getContentPane();
		
		c.add(new South(),BorderLayout.SOUTH);
		//c.add(new Center(),BorderLayout.CENTER);
		c.add(new NORTH(),BorderLayout.NORTH);
		c.add(new Center(),BorderLayout.CENTER);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	class Center extends JPanel{
		
			      public void paintComponent(Graphics g) {
			    	  g.setColor(Color.GREEN);
			    	  g.fillRect(30,120,100,100);
			    	  
			    	  
			    	  g.setColor(Color.RED);
					  g.fillOval(100,50,50,50);

			    	  g.setColor(Color.BLACK);
			    	  
			    	  g.fillArc(200,60,50,50,0,270);
			         
			    	  
			    	  
			    	  
			    	  g.setColor(Color.BLUE);
			    	  int x[] = {200,240,160};
			          int y[] = {160,220,220};

			          g.fillPolygon(x, y, 3);
			          

			         
			      
			         
			      }
			   
	}
	class NORTH extends JPanel{
		Thread t;
		NORTH(){
			setBackground(new Color(0x00ff00));
			J1 = new JLabel(calc());
			J1.setFont(new Font("궁서",Font.BOLD,50));
			add(J1);
			addMouseListener(new Mymouse());
			
		}
		
		class Mymouse extends MouseAdapter{
		
			public void mouseEntered(MouseEvent e){ //마우스클릭
				t= new MyThread();
				t.start();
			}
			public void mouseExited(MouseEvent e){ //컴포넌트를 빠져나올때         
				
				t.interrupt();
			}
		}
		
		public String calc() {
			
			Calendar cd = Calendar.getInstance();
			int hour = cd.get(Calendar.HOUR_OF_DAY);
			int miunte = cd.get(Calendar.MINUTE);
			int seconde = cd.get(Calendar.SECOND);
			
			
			String text=" ";
			text += "현재시간 "+text.concat(Integer.toString(hour)+":")+text.concat(Integer.toString(miunte)+":")+text.concat(Integer.toString(seconde));
			
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
					} //1초
				}
			}
		}
	}
	
	
	
	
	
	class South extends JPanel{
		South(){
			J2 = new JLabel("작성자: 문호준_2019201134");	
			setBackground(new Color(0x12E21));
			J2.setFont(new Font("궁서",Font.BOLD,50));
			add(J2);
		}
	}
	
	
	public static void main(String[] args) {
		new 문호준_2019201134();

	}

}
