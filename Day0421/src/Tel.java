
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Tel {
	static HashMap <String, String> h = new HashMap<>();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		h.put("�ڷγ�", "1339");
		h.put("������", "112");
		h.put("�ҹ漭", "119");
		h.put("�����ȳ�", "114");
		
		Set<String> keys = h.keySet();
		Iterator<String> it=keys.iterator();
		
		System.out.println("�� ã��?");
		String what = sc.next();
		boolean b = false ;
		while(it.hasNext()) {
			String a 	= it.next();
			if(what.equals(a)) {
				System.out.println(what+"�� ��ȭ��ȣ�� "+h.get(a));
				b=true;
				break;
			}
		}
		if(b!=true) {
			System.out.println("ã���ô°� ���׿�.");
		}
		System.out.println("������");
		
	}

}
