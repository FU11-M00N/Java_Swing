
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Tel {
	static HashMap <String, String> h = new HashMap<>();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		h.put("코로나", "1339");
		h.put("경찰서", "112");
		h.put("소방서", "119");
		h.put("전번안내", "114");
		
		Set<String> keys = h.keySet();
		Iterator<String> it=keys.iterator();
		
		System.out.println("뭐 찾음?");
		String what = sc.next();
		boolean b = false ;
		while(it.hasNext()) {
			String a 	= it.next();
			if(what.equals(a)) {
				System.out.println(what+"의 전화번호는 "+h.get(a));
				b=true;
				break;
			}
		}
		if(b!=true) {
			System.out.println("찾으시는게 없네요.");
		}
		System.out.println("으하하");
		
	}

}
