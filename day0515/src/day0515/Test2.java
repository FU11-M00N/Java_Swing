package day0515;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class Calc extends JFrame{
	Calc(){
		setTitle("�Ի��");
		setSize(500,600);
		Container conn = getContentPane();
		conn.setLayout(new GridLayout(6,4,10,10));
		String str[]= {"%","CE","C","X��ư","1/x","x^2","2 ��Ʈ x","/","7","8","9","x","4","5","6","-","1","2","3","+"
				,"+/-","0",".","="};
		
		for(int i =0;i<24;i++) {
			conn.add(new JButton(str[i]));
		}
		
		setVisible(true); //�������� �Ҹ���. �⺻ ���� false �� �Ǿ�����.
		//X �� ������ ���α׷��� ������� �ʱ� ������ ���� �޼ҵ带 �̿��ؾ���.
		setDefaultCloseOperation(EXIT_ON_CLOSE); //X �� ������ ���α׷� ����

	}
}
public class Test2 {

	public static void main(String[] args) {
		
		new Calc();

	}

}
