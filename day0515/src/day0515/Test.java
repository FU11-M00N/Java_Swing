package day0515;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


class Eun extends JFrame{
	
	Eun(){	//�����ڴ� �����͸� �ʱ�ȭ�ϴ� ����.
		
		setTitle("Swing Frame"); //�����̳� â�� ����
		setSize(500,400); //�ȼ� ������ ��.
		Container con =getContentPane(); //����Ʈ �ҿ� ������Ʈ ����
		con.setBackground(Color.orange);
		//con.setLayout(new FlowLayout(FlowLayout.LEFT)); // �⺻�� ��� ���� & LEFT �� �Ϸ��� FlowLayout.LEFT or FlowLayout.RIGHT �������.
		//con.setLayout(new BorderLayout(10,30)); // �������� ,��� �� ������ �����ϴ� ����.
		//con.setLayout(new GridLayout(2,3,20,50)); //��� ���� ���������.
		con.setLayout(null); //���̾ƿ� ����. ���� �־������.
		JButton b = new JButton("PUSH");
		b.setSize(100, 50);
		b.setLocation(200, 80);
		con.add(b,BorderLayout.CENTER); // �߾�
		con.add(new JButton("PUSHH"),BorderLayout.EAST); // ����
		con.add(new JButton("PUUSH"),BorderLayout.WEST); // ����
		con.add(new JButton("PUSSH"),BorderLayout.SOUTH); // ����
		con.add(new JButton("PUSH!"),BorderLayout.NORTH); // ����
		setVisible(true); //�������� �Ҹ���. �⺻ ���� false �� �Ǿ�����.
		//X �� ������ ���α׷��� ������� �ʱ� ������ ���� �޼ҵ带 �̿��ؾ���.
		setDefaultCloseOperation(EXIT_ON_CLOSE); //X �� ������ ���α׷� ����.
	}
}

public class Test extends JFrame{

	Test(){ 
		
	}
	public static void main(String[] args) {
		new Eun(); // ������ ȣ��
	}

}
