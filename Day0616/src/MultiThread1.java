
public class MultiThread1 extends Thread {
	String name;
	
	public MultiThread1(String name) {
		this.name=name;
		
	}
	
	public void run() {
		for(int i =0; i<3; i++) {
		System.out.println(name+" 스레드");
		}
		
		
	}
	
	public static void main(String[] args) {
		MultiThread1 t1 = new MultiThread1("첫번째");
		t1.start();
		MultiThread1 t2 = new MultiThread1("두번째 ");
		t2.start();
		
	}

}
