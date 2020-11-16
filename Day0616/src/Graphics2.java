import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Graphics2 extends JFrame {
	
	public Graphics2(String str) {
		super(str);
		setSize(500,600);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(new MyPanels(),BorderLayout.CENTER);
		JPanel p = new JPanel();
		
		p.setBackground(Color.green);
		JLabel jb = new JLabel("작성자 호주ㄴ");
		p.add(jb);
		c.add(p,BorderLayout.SOUTH);

		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	class MyPanels extends JPanel{
		ImageIcon ico = new ImageIcon("C:\\Users\\user\\OneDrive\\Desktop\\이미지 002.png");
		Image img = ico.getImage();
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.fillArc(100,100,50,50,0,120);
			g.setColor(Color.RED);
			g.fillArc(100,100,50,50,10,120);
			g.setColor(Color.YELLOW);
			g.fillArc(100,100,50,50,-90,120);
			
			//g.drawImage(100, 200, 50, 50, this);

			g.drawImage(img ,0,0,this.getWidth(), this.getHeight(), this);
		}
		
	}
	public static void main(String[] args) {
		new Graphics2("호우그리기");

	}

}
