import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


		

public class test extends JFrame {
	Container c;
	JButton btn[] = new JButton[4];
	String s[] = {"���","������","�޷ο�","ȣ����;"};
	test(){
		setSize(500,400);
		setTitle("test");
		c = getContentPane();
	//	c.setLayout(new FlowLayout());
		c.setLayout(null);
		
		for(int i=0; i<s.length; i++) {
			btn[i] = new JButton(s[i]);
			btn[i].setBounds(100,50*(i+1),100,30);
			btn[i].addActionListener(new MyAction());
			c.add(btn[i]);
		}
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}


	public static void main(String[] args) {
		new test();
		
	}
class MyAction implements ActionListener{
	public void actionPerformed(ActionEvent k) {
		JButton bt = (JButton)k.getSource();
		if(bt.getText().equals("���")) {
			bt.setText("apple");
		}
		else if(bt.getText().equals("������")){
			bt.setText("Orange");
		}
		else {
			bt.setText("�׷������������Ҿ�ߢ��ߴµ� �� �� ����� �����پ�");
		}
	}
}

	
}
