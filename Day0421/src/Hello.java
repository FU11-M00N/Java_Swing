import java.util.Iterator;
import java.util.Vector;

public class Hello {

	public static void main(String[] args) {
		
		//컬렉션 객체는 다 꺽쇠로 표현해야함. 꺽쇠 안에는 자료형(객체로)
		Vector <Integer> v = new Vector<>(); //정수형
		Vector <Double> v2 = new Vector<Double>(); //실수형
		Vector <String> v3 = new Vector<String>(); //문자열형
		Vector <Integer> v4 =new Vector<>(); //이렇게도 사용가능.
		Vector v5 = new Vector<>(); //문자, 정수, 실수 다 됨.
		
		
		v.add(44); v2.add(4.44); v3.add("사사사"); v4.add(444); v5.add("으하ㅏ하하"); v5.add(null);
		
		v.add(7); v.add(44); v.add(100); v.add(777);v.add(55);
		
		System.out.println(v);
		System.out.println("v 크기 : "+v.size()+" \nv 용량 : "+v.capacity()); // v 안의 크기
		v.add(7); v.add(44); v.add(100); v.add(777);v.add(55);
		System.out.println("v 크기 : "+v.size()+" \nv 용량 : "+v.capacity()); // v 안의 크기
		
		int sum = 0;
		
		for(int i=0;i<v.size();i++) {
			int x = v.get(i);
			sum= sum+x;
			System.out.print(x+"  ");
		}
		System.out.println("\nv 의 전체 합: "+sum);
		v.add(1,5555); //1번째 위치에 5555 추가!
		System.out.println(v);
		v.remove(4);
		System.out.println(v);
		
		
		for(Integer z :v) { //자료형 변수명(?): 벡터이름 
			System.out.print(z+" ");
		}
		System.out.println();
		
		Iterator <Integer> it = v.iterator();
		
		
		while(it.hasNext()) { //for 문 처럼 계속 넘어가면서 데이터가 있는지 없는지 확인하는 역할.
			int k=it.next();
			System.out.println("데이터가 있구나?");
			System.out.print(k+" ");
		}
		System.out.println();
	}

}
