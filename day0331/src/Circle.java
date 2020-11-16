import java.util.Scanner;

public class Circle { //클래스명: 멤버변수+ 멤버함수(메소드) 로 구성
	Circle(){
		
	}
	Circle(int radius){ //오버로딩(매개변수가 달라야함)
		this.radius=radius;
	}
	Circle(int radius,int n){ //오버로딩(매개변수가 달라야함)
		this.radius=radius;
		this.n=n;
	}
	int n;
	int radius; //반지름, 멤버변수
	final static double PI=3.141592;//final 상수, 변경불가능
	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.getArea(7);
		Circle c2 = new Circle(8);
		c2.getArea2();
		Scanner sc = new Scanner(System.in);
		System.out.println("넓이를 구할겁니다.\n가로와 세로를 입력해주세요.");
		Circle c3 = new Circle(sc.nextInt(),sc.nextInt());
		c3.getArea3();
		
	}
	void getArea3() {
		//사각형의 넓이
		System.out.println("사각형의 넓이값은>>>"+n*radius);
		
		
	}
	void getArea2() {
		//반지름이 7인 원의 넓이 구하기(7*7*PI)
		System.out.println("반지름이 "+radius+"인 원의 넓이 : "+radius*radius*PI);
		
	}
	void getArea(int radius) {
		//반지름이 7인 원의 넓이 구하기(7*7*PI)
		System.out.println("반지름이 "+radius+"인 원의 넓이 : "+radius*radius*PI);
		
	}

}
