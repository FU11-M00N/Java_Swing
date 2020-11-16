class Test{
	static int sum(int a, int b) {
		
		
		return a+b;
	}
	float avg(int a, int b, int c) {
		return (a+b+c)/3.0F;
	}
}
public class Hello {

	int a; //멤버 변수(속성, 필드)
	public static void main(String[] args) {
		System.out.println("Hello World!");
		//ctrl+f11 -> 실행
		getSum(5,8);
		getAvg(45,67,89);
		Hello h = new Hello(); //객체변수 생성
		h.print();
		System.out.println("합 :"+Test.sum(4, 5)); //static 이기 때문에 클래스명.메소드명 바로 가능.
		Test t = new Test();
		System.out.println("평균 : "+t.avg(3, 4, 5));
	}
	
	static void getSum(int a, int b) //클래스 메소드
	{
		System.out.println("합: "+(a+b));
	}
	static void getAvg(int a, int b, int c) //클래스 메소드
	{
		System.out.println("합: "+(a+b+c)/3);
	}
	void print()//멤버메소드
	{
		System.out.println("인쇄");
	}
	

}
