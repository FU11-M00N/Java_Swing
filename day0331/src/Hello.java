class Test{
	static int sum(int a, int b) {
		
		
		return a+b;
	}
	float avg(int a, int b, int c) {
		return (a+b+c)/3.0F;
	}
}
public class Hello {

	int a; //��� ����(�Ӽ�, �ʵ�)
	public static void main(String[] args) {
		System.out.println("Hello World!");
		//ctrl+f11 -> ����
		getSum(5,8);
		getAvg(45,67,89);
		Hello h = new Hello(); //��ü���� ����
		h.print();
		System.out.println("�� :"+Test.sum(4, 5)); //static �̱� ������ Ŭ������.�޼ҵ�� �ٷ� ����.
		Test t = new Test();
		System.out.println("��� : "+t.avg(3, 4, 5));
	}
	
	static void getSum(int a, int b) //Ŭ���� �޼ҵ�
	{
		System.out.println("��: "+(a+b));
	}
	static void getAvg(int a, int b, int c) //Ŭ���� �޼ҵ�
	{
		System.out.println("��: "+(a+b+c)/3);
	}
	void print()//����޼ҵ�
	{
		System.out.println("�μ�");
	}
	

}
