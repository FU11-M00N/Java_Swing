
public class MultiThread1 extends Thread {
	String name;
	
	public MultiThread1(String name) {
		this.name=name;
		
	}
	
	public void run() {
		for(int i =0; i<3; i++) {
		System.out.println(name+" ������");
		}
		
		
	}
	
	public static void main(String[] args) {
		MultiThread1 t1 = new MultiThread1("ù��°");
		t1.start();
		MultiThread1 t2 = new MultiThread1("�ι�° ");
		t2.start();
		
	}

}
