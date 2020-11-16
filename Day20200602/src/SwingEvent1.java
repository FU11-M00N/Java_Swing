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
	JLabel b = new JLabel("����!");

	SwingEvent1(){
		setTitle("�̺�Ʈ ����");
		setSize(500,400);
		setLayout(null);
		Container con = getContentPane();
		
		con.setBackground(Color.yellow);
	
		b.setForeground(Color.red);
		b.setFont(new Font("�������",Font.BOLD,30));
		b.setLocation(100,300);
		b.setSize(150,50);
		con.addMouseListener(new MyMouseAdapter());
		con.addKeyListener(new MyKey());
		con.add(b);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		//���콺�� Ŭ���� ������Ʈ���� ��Ŀ�� ����
		con.setFocusable(true);
		con.requestFocus();
	}
	class MyMouseAdapter extends MouseAdapter{
		public void mousePressed(MouseEvent e) { //���콺 ��ư�� ��������
			int x = e.getX();
			int y = e.getY();
			b.setLocation(x, y);
			
		} //
	}
	class MyKey extends KeyAdapter{
		public void keyPressed(KeyEvent e) { // Ű�� ��������
			int key = e.getKeyChar(); // ���� �ڵ带 ���Ϥ�,
			int keys = e.getKeyCode();
			if(key =='a') {
				System.exit(0);
				}
			else if(keys== KeyEvent.VK_END)
				System.exit(0);
			
			}
		}
	
		
	
	
	/*class MyMouse implements MouseListener{
		public void mousePressed(MouseEvent e) { //���콺 ��ư�� ��������
			int x = e.getX();
			int y = e.getY();
			b.setLocation(x, y);
			
		} //
		public void mouseReleased(MouseEvent e) {//������ ���콺 ��ư�� ��������
			
			
		}
		
		
		public void mouseClicked(MouseEvent e) { // ���콺 ��ư�� Ŭ���ɶ�
			
			
		}
		public void mouseEntered(MouseEvent e) {// ���콺 ������Ʈ ���� �ö�ö�
			
			
		}
		public void mouseExited(MouseEvent e) {// ������Ʈ ���� �ö�� ���콺�� ������Ʈ�� �����
			
			
		}
	}
	*/
	public static void main(String[] args) {
		
		new SwingEvent1();
	}

}
