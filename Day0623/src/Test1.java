import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test1 extends JFrame{
	JLabel JL ;
	JButton JB,JB2;
	
	Test1(){
		setTitle("스레드");
		setSize(500,400);
		Container c = getContentPane();
		c.add(new JPanelA(),BorderLayout.NORTH);
		c.add(new JPanelB(),BorderLayout.SOUTH);
		c.add(new JPanelC(),BorderLayout.EAST);
		c.add(new JPanelD(),BorderLayout.WEST);
		c.add(new JPanelE(),BorderLayout.CENTER);
	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	class JPanelA extends JPanel{
		JPanelA(){
			setBackground(new Color(255,211,34));//setBackground(Color.green)
			
		}

		
	}
	class JPanelB extends JPanel{
		JPanelB(){
			setBackground(new Color(218,44,55));//setBackground(Color.green)
			
		}

		
	}
	class JPanelC extends JPanel{
		JPanelC(){
			setBackground(new Color(121,66,21));//setBackground(Color.green)
			
		}

		
	}
	class JPanelD extends JPanel{
		JPanelD(){
			setBackground(new Color(2,25,34));//setBackground(Color.green)
			
		}

		
	}
	class JPanelE extends JPanel implements ActionListener{
		Thread t;
		JPanelE(){
			setBackground(new Color(12,125,134));//setBackground(Color.green)
			JL = new JLabel("1");
			JB = new JButton("실행");		
			JB2 = new JButton("중지");		
			add(JL);
			add(JB); 
			add(JB2);
			JB.addActionListener(this);
			JB2.addActionListener(this);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton) e.getSource();
			if(b.getText().equals("실행")) {
				t= new MyThread();	
				t.start(); // 스레드 시작
			}
			else if (b.getText().equals("중지")) {
				t.interrupt(); // 스레드 ㅅㄱ
			}
		}
		class MyThread extends Thread{
			public void run() {
				int k=0;
				while(true) {
					JL.setText(Integer.toString(k++));
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

	public static void main(String[] args) {
		new Test1();
		
	}

}
