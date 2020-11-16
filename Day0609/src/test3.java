import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



public class test3 extends JFrame {
	JLabel j1,j2;
	JRadioButton JRB1,JRB2,JRB3;
	Container c;
	JCheckBox JCB1,JCB2, JCB3;
	JTextField JTF1;
	int sum=0;
	int num1=20;
	int num2=30;
	int num3=50;
	test3(){
		setTitle("살려줘");
		setSize(500,400);
		c = getContentPane();
		
		j1 = new JLabel("과일가게");
		j1.setBounds(250,0,300,100);
		add(j1);
		c.setLayout(null);
		
		j1.setFont(new Font("궁서체",Font.ITALIC,30));
		ButtonGroup g = new ButtonGroup();
		JRB1 = new JRadioButton("특상");
		JRB2 = new JRadioButton("상");
		JRB3 = new JRadioButton("하");
		JRB1.setBounds(250,0,50,100);
		JRB2.setBounds(280,25,50,100);
		JRB3.setBounds(300,50,50,100);
		JRB1.addItemListener(new MyAction2());		
		JRB2.addItemListener(new MyAction2());	
		JRB3.addItemListener(new MyAction2());
		
		g.add(JRB1); g.add(JRB2); g.add(JRB3);
		
		c.add(JRB1);
		c.add(JRB2);
		c.add(JRB3);
		
		
		j2 = new JLabel("선택하세용");
		c.add(j2);
		JCB1 = new JCheckBox("배");		
		JCB2 = new JCheckBox("사과");		
		JCB3 = new JCheckBox("귤");
		JCB1.addItemListener(new MyAction());
		JCB2.addItemListener(new MyAction());
		JCB3.addItemListener(new MyAction());

		c.add(JCB1);
		c.add(JCB2);
		c.add(JCB3);
	
		
		
		JTF1 = new JTextField("빵원",20);
		c.add(JTF1);
	
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new test3();

	}
class MyAction2 implements ItemListener{

	@Override
	public void itemStateChanged(ItemEvent ee) {
		// TODO Auto-generated method stub
		JRadioButton jb = (JRadioButton)ee.getSource();
		if(jb.getText().equals("특상")) {
			j2 .setText("특상입니다람쥐");
		}
		else if(jb.getText().equals("상")) {
			j2 .setText("상입니다람쥐");
		}
		if(jb.getText().equals("하")) {
			j2 .setText("하상입니다람쥐");
		}
	}
	
	
}
class MyAction implements ItemListener{
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		JCheckBox jc = (JCheckBox)e.getSource();
		if(e.getStateChange() == ItemEvent.SELECTED) {
			sum=sum+num1;
			JTF1.setText(Integer.toString(sum)+"원");
		}
		else {
			sum=sum-num1;
			JTF1.setText(Integer.toString(sum)+"원");
		}
		if(e.getStateChange() == ItemEvent.SELECTED) {
			sum=sum+num2;
			JTF1.setText(Integer.toString(sum)+"원");
		}
		else {
			sum=sum-num2;
			JTF1.setText(Integer.toString(sum)+"원");
		}
		if(e.getStateChange() == ItemEvent.SELECTED) {
			sum=sum+num3;
			JTF1.setText(Integer.toString(sum)+"원");
		}
		else {
			sum=sum-num3;
			JTF1.setText(Integer.toString(sum)+"원");
		}
		
	}
}
	
}
