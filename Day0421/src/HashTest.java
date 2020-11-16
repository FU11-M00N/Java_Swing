import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashTest {

	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<>();
		h.add(5);
		h.add(7);
		h.add(11);
		h.add(7); //�ߺ��� ������� �ʱ� ������ 7�� ���̻� ���� ����.
		System.out.println(h);
		
		HashMap <Integer, String> m = new HashMap<>(); // key, value
		m.put(1, "������ ���콺"); //�ٸ� ���� add �� ���� ����.
		m.put(2, "����"); //key �� �ߺ� �ȵ�. value�� �ߺ� ����
		m.put(3, "����");
		System.out.println(m+"size: "+m.size());
		
		Set <Integer> keys = m.keySet();
		Iterator <Integer> it=keys.iterator();
		
		while(it.hasNext()) {
			Integer a= it.next();
			String b = m.get(a);
			System.out.println(a + " , "+ b);
		}
	}

}
