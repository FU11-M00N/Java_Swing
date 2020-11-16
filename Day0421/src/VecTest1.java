import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class VecTest1 {

	public static void main(String[] args) {
		ArrayList <String> a = new ArrayList<>();
		a.add("나는 은비");
		a.add("옆은 호준");
		a.add("옆에 승호");
		a.add("앞에 나");
		a.add("그다음에 또 나");
		
		Iterator <String> it = a.iterator();
		
		while(it.hasNext()) {
			
			String str= it.next();
			System.out.print(str+" ");
			
		}
		Collections.sort(a);
		System.out.println("\n"+a);
		//Collections.reverse(a);
		//System.out.println(a);
		int num=Collections.binarySearch(a, "옆은 호준");
		System.out.println(num+"번째에 저장되어 있습니다.");
	}

}
