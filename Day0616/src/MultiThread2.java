
public class MultiThread2 implements Runnable {

	String name;

	MultiThread2(String name) {
		this.name=name;
	}
	public void run() {
		
		for(int i=1; i<=3; i++) {
		System.out.println(name+"���̵�");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThread2 t1 = new MultiThread2("�籤");
		Thread th1= new Thread(t1);
		th1.start();
		MultiThread2 t2 = new MultiThread2("ȣ�ִ�");
		Thread th2= new Thread(t2);
		th2.start();
	}

}
