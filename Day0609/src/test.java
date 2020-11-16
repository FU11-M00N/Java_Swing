import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


		

public class test extends JFrame {
	Container c;
	JButton btn[] = new JButton[4];
	String s[] = {"사과","오렌지","메로온","호ㅜ준;"};
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
		if(bt.getText().equals("사과")) {
			bt.setText("apple");
		}
		else if(bt.getText().equals("오렌지")){
			bt.setText("Orange");
		}
		else {
			bt.setText("그런짓은하지말았어야↗했는데 넌 그 사실을 몰랐↘어");
		}
	}
}

	
}
