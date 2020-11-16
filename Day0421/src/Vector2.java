import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;


public class Vector2 {

	static Scanner sc = new Scanner(System.in);
	static Vector <String> v = new Vector<String>();
	
	public static void main(String[] args) {

		while(true) {
			System.out.println("선택하라!");
			int num=sc.nextInt();
			switch(num) {
			case 1: insert(); break;
			case 2: print(); break;
			case 3: see(); break;
			}
			if (num==4) {
				System.out.println("종료됩니다.");
				sc.close();
				break;
			}
		}

	}
	
	static void insert() {
		System.out.println("회원 정보를 입력해주세요.");
		v.add(sc.next());
	}
	static void print() {
		System.out.println(v);
	}
	static void see() {
		System.out.println("조회할 이름은?");
		String name=sc.next();
		Collections.sort(v);
		int x = Collections.binarySearch(v, name);
		if(x<0) {
			System.out.println("우리 회원이 아닙니다.");
		}
		else {
			System.out.println(name+"는 "+x+"번째");
		}

	}
	
	

}
