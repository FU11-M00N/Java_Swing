import java.util.Scanner;

public class Circle { //Ŭ������: �������+ ����Լ�(�޼ҵ�) �� ����
	Circle(){
		
	}
	Circle(int radius){ //�����ε�(�Ű������� �޶����)
		this.radius=radius;
	}
	Circle(int radius,int n){ //�����ε�(�Ű������� �޶����)
		this.radius=radius;
		this.n=n;
	}
	int n;
	int radius; //������, �������
	final static double PI=3.141592;//final ���, ����Ұ���
	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.getArea(7);
		Circle c2 = new Circle(8);
		c2.getArea2();
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� ���Ұ̴ϴ�.\n���ο� ���θ� �Է����ּ���.");
		Circle c3 = new Circle(sc.nextInt(),sc.nextInt());
		c3.getArea3();
		
	}
	void getArea3() {
		//�簢���� ����
		System.out.println("�簢���� ���̰���>>>"+n*radius);
		
		
	}
	void getArea2() {
		//�������� 7�� ���� ���� ���ϱ�(7*7*PI)
		System.out.println("�������� "+radius+"�� ���� ���� : "+radius*radius*PI);
		
	}
	void getArea(int radius) {
		//�������� 7�� ���� ���� ���ϱ�(7*7*PI)
		System.out.println("�������� "+radius+"�� ���� ���� : "+radius*radius*PI);
		
	}

}
