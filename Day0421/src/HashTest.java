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
		h.add(7); //중복을 허용하지 않기 때문에 7은 더이상 들어가지 않음.
		System.out.println(h);
		
		HashMap <Integer, String> m = new HashMap<>(); // key, value
		m.put(1, "멋쟁이 마우스"); //다른 것의 add 와 같은 역할.
		m.put(2, "은비"); //key 는 중복 안됨. value는 중복 가능
		m.put(3, "로준");
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
