import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;


public class Vector2 {

	static Scanner sc = new Scanner(System.in);
	static Vector <String> v = new Vector<String>();
	
	public static void main(String[] args) {

		while(true) {
			System.out.println("�����϶�!");
			int num=sc.nextInt();
			switch(num) {
			case 1: insert(); break;
			case 2: print(); break;
			case 3: see(); break;
			}
			if (num==4) {
				System.out.println("����˴ϴ�.");
				sc.close();
				break;
			}
		}

	}
	
	static void insert() {
		System.out.println("ȸ�� ������ �Է����ּ���.");
		v.add(sc.next());
	}
	static void print() {
		System.out.println(v);
	}
	static void see() {
		System.out.println("��ȸ�� �̸���?");
		String name=sc.next();
		Collections.sort(v);
		int x = Collections.binarySearch(v, name);
		if(x<0) {
			System.out.println("�츮 ȸ���� �ƴմϴ�.");
		}
		else {
			System.out.println(name+"�� "+x+"��°");
		}

	}
	
	

}
