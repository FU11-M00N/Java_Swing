import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Vector;

public class Coltest {

	public static void main(String[] args) {
		Vector <Integer> v = new Vector<Integer>(); //���� ���� : �뷮����
		v.add(77);
		v.add(44);
		v.add(77);
		System.out.println(v);
		v.add(2,177);
		System.out.println(v);
		System.out.println(v.get(2));
		Collections.sort(v);
		System.out.println(v);
		//Collections.reverse(v);Collections.max(v);Collections.min(v));
		
		
		
		//2. set
		
		HashSet <Float> h = new HashSet<>();
		h.add(4.4f);
		h.add(5.9f);
		h.add(1.4f);
		h.add(4.4f);
		System.out.println(h+","+h.contains(5.9f)); //contains�� ���� �ִ��� ������ ã�� �� ���.
		System.out.println(h.toString());
		
		//3.Map
		HashMap <Integer, String> m = new HashMap<>();
		

		m.put(0, "ȫ����");
		m.put(1,"��ȣ��");
		m.put(3,"��ȣ��");
		
		System.out.println(m+", "+m.get(3));
		
	}

}
