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
//�ڷ����� �پ��ϰ� �ְ� ���� �� ���׸�
	public static void main(String[] args) {
		_TT t= new _TT();
		t.setData(77);
		System.out.println(t.getData());
		
		Demo<Integer> d= new Demo<>();
		Demo<String> s = new Demo<>();
		
		d.setData(66);
		System.out.println(d.getData());
		s.setData("ȣ��Ͼ�");
		System.out.println(s.getData());
	}

}
