import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class SwingData extends JFrame{
	JButton b[]= new JButton[3];
	String str[] = {"사이버", "해킹","보안과"};
	SwingData(){
		setTitle("중간고사");
		setSize(300,400);
		Container c = getContentPane();
		c.setBackground(Color.green);
		c.setLayout(new FlowLayout());
		JLabel j = new JLabel("이름 :");
		JTextField t = new JTextField(10);
		c.add(j);
		c.add(t);
		for(int i=0; i<b.length; i++) {
			int r= (int)(Math.random()*10+1);
			b[i] = new JButton(Integer.toString(r));//str[i];
			b[i].setBackground(Color.yellow);
			b[i].setForeground(Color.red);
			add(b[i]);
			
		}
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingData();
	}

}
