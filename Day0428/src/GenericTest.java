class _TT{
	int a;
	void setData(int a){
		this.a=a;
	}
	
	int getData() {
		return a;
	}
}
class Demo<T>{
	T a;
	void setData(T a) {
		this.a=a;
	}
	T getData() {
		return a;
	}
}

public class GenericTest {
//자료형을 다양하게 넣고 싶을 때 제네릭
	public static void main(String[] args) {
		_TT t= new _TT();
		t.setData(77);
		System.out.println(t.getData());
		
		Demo<Integer> d= new Demo<>();
		Demo<String> s = new Demo<>();
		
		d.setData(66);
		System.out.println(d.getData());
		s.setData("호쥬니야");
		System.out.println(s.getData());
	}

}
