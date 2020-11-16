package day0515;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class Calc extends JFrame{
	Calc(){
		setTitle("게산기");
		setSize(500,600);
		Container conn = getContentPane();
		conn.setLayout(new GridLayout(6,4,10,10));
		String str[]= {"%","CE","C","X버튼","1/x","x^2","2 루트 x","/","7","8","9","x","4","5","6","-","1","2","3","+"
				,"+/-","0",".","="};
		
		for(int i =0;i<24;i++) {
			conn.add(new JButton(str[i]));
		}
		
		setVisible(true); //리턴형이 불린임. 기본 값이 false 로 되어있음.
		//X 를 눌러도 프로그램이 종료되지 않기 때문에 따로 메소드를 이용해야함.
		setDefaultCloseOperation(EXIT_ON_CLOSE); //X 를 누르면 프로그램 종료

	}
}
public class Test2 {

	public static void main(String[] args) {
		
		new Calc();

	}

}
