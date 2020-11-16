package day0515;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


class Eun extends JFrame{
	
	Eun(){	//생성자는 데이터를 초기화하는 역할.
		
		setTitle("Swing Frame"); //컨테이너 창의 제목
		setSize(500,400); //픽셀 단위로 들어감.
		Container con =getContentPane(); //컨텐트 팬에 컴포넌트 부착
		con.setBackground(Color.orange);
		//con.setLayout(new FlowLayout(FlowLayout.LEFT)); // 기본은 가운데 정렬 & LEFT 로 하려면 FlowLayout.LEFT or FlowLayout.RIGHT 해줘야함.
		//con.setLayout(new BorderLayout(10,30)); // 동서남북 ,가운데 로 영역을 지정하는 것임.
		//con.setLayout(new GridLayout(2,3,20,50)); //행과 열을 정해줘야함.
		con.setLayout(null); //레이아웃 없음. 직접 넣어줘야함.
		JButton b = new JButton("PUSH");
		b.setSize(100, 50);
		b.setLocation(200, 80);
		con.add(b,BorderLayout.CENTER); // 중앙
		con.add(new JButton("PUSHH"),BorderLayout.EAST); // 동쪽
		con.add(new JButton("PUUSH"),BorderLayout.WEST); // 서쪽
		con.add(new JButton("PUSSH"),BorderLayout.SOUTH); // 남쪽
		con.add(new JButton("PUSH!"),BorderLayout.NORTH); // 북쪽
		setVisible(true); //리턴형이 불린임. 기본 값이 false 로 되어있음.
		//X 를 눌러도 프로그램이 종료되지 않기 때문에 따로 메소드를 이용해야함.
		setDefaultCloseOperation(EXIT_ON_CLOSE); //X 를 누르면 프로그램 종료.
	}
}

public class Test extends JFrame{

	Test(){ 
		
	}
	public static void main(String[] args) {
		new Eun(); // 생성자 호출
	}

}
