import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingEvent1 extends JFrame {
	JLabel b = new JLabel("아하!");

	SwingEvent1(){
		setTitle("이벤트 연습");
		setSize(500,400);
		setLayout(null);
		Container con = getContentPane();
		
		con.setBackground(Color.yellow);
	
		b.setForeground(Color.red);
		b.setFont(new Font("맑은고딕",Font.BOLD,30));
		b.setLocation(100,300);
		b.setSize(150,50);
		con.addMouseListener(new MyMouseAdapter());
		con.addKeyListener(new MyKey());
		con.add(b);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		//마우스가 클릭된 컴포넌트에게 포커스 설정
		con.setFocusable(true);
		con.requestFocus();
	}
	class MyMouseAdapter extends MouseAdapter{
		public void mousePressed(MouseEvent e) { //마우스 버튼이 눌러질때
			int x = e.getX();
			int y = e.getY();
			b.setLocation(x, y);
			
		} //
	}
	class MyKey extends KeyAdapter{
		public void keyPressed(KeyEvent e) { // 키가 눌러질때
			int key = e.getKeyChar(); // 문자 코드를 리턴ㄹ,
			int keys = e.getKeyCode();
			if(key =='a') {
				System.exit(0);
				}
			else if(keys== KeyEvent.VK_END)
				System.exit(0);
			
			}
		}
	
		
	
	
	/*class MyMouse implements MouseListener{
		public void mousePressed(MouseEvent e) { //마우스 버튼이 눌러질때
			int x = e.getX();
			int y = e.getY();
			b.setLocation(x, y);
			
		} //
		public void mouseReleased(MouseEvent e) {//눌러진 마우스 버튼을 떼어질때
			
			
		}
		
		
		public void mouseClicked(MouseEvent e) { // 마우스 버튼이 클릭될때
			
			
		}
		public void mouseEntered(MouseEvent e) {// 마우스 컴포넌트 위에 올라올때
			
			
		}
		public void mouseExited(MouseEvent e) {// 컴포넌트 위에 올라온 마우스가 컴포넌트를 벗어날때
			
			
		}
	}
	*/
	public static void main(String[] args) {
		
		new SwingEvent1();
	}

}
