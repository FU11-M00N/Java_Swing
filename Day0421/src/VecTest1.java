import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class VecTest1 {

	public static void main(String[] args) {
		ArrayList <String> a = new ArrayList<>();
		a.add("���� ����");
		a.add("���� ȣ��");
		a.add("���� ��ȣ");
		a.add("�տ� ��");
		a.add("�״����� �� ��");
		
		Iterator <String> it = a.iterator();
		
		while(it.hasNext()) {
			
			String str= it.next();
			System.out.print(str+" ");
			
		}
		Collections.sort(a);
		System.out.println("\n"+a);
		//Collections.reverse(a);
		//System.out.println(a);
		int num=Collections.binarySearch(a, "���� ȣ��");
		System.out.println(num+"��°�� ����Ǿ� �ֽ��ϴ�.");
	}

}
