package day0515;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

class Piano extends JFrame{
	Piano(){
		setTitle("�ǾƳ� �ǹ�"); // == super("�ǾƳ� �ǹ�");
		setSize(1200,320);
		
		Container conne = getContentPane();
		conne.setLayout(null);
		
		for(int i=1;i<11;i++) {
			JButton pia = new JButton("c"+i);
			pia.setSize(60, 200);
			pia.setLocation(i*100, 80);
			pia.setBackground(Color.black);
			conne.add(pia);
		}
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //X �� ������ ���α׷� ����
		
	}
}
public class Test3 {

	public static void main(String[] args) {
		new Piano();

	}

}
