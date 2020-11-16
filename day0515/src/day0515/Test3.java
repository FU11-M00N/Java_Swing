package day0515;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

class Piano extends JFrame{
	Piano(){
		setTitle("피아노 건반"); // == super("피아노 건반");
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
		setDefaultCloseOperation(EXIT_ON_CLOSE); //X 를 누르면 프로그램 종료
		
	}
}
public class Test3 {

	public static void main(String[] args) {
		new Piano();

	}

}
