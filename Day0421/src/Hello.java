import java.util.Iterator;
import java.util.Vector;

public class Hello {

	public static void main(String[] args) {
		
		//�÷��� ��ü�� �� ����� ǥ���ؾ���. ���� �ȿ��� �ڷ���(��ü��)
		Vector <Integer> v = new Vector<>(); //������
		Vector <Double> v2 = new Vector<Double>(); //�Ǽ���
		Vector <String> v3 = new Vector<String>(); //���ڿ���
		Vector <Integer> v4 =new Vector<>(); //�̷��Ե� ��밡��.
		Vector v5 = new Vector<>(); //����, ����, �Ǽ� �� ��.
		
		
		v.add(44); v2.add(4.44); v3.add("����"); v4.add(444); v5.add("���Ϥ�����"); v5.add(null);
		
		v.add(7); v.add(44); v.add(100); v.add(777);v.add(55);
		
		System.out.println(v);
		System.out.println("v ũ�� : "+v.size()+" \nv �뷮 : "+v.capacity()); // v ���� ũ��
		v.add(7); v.add(44); v.add(100); v.add(777);v.add(55);
		System.out.println("v ũ�� : "+v.size()+" \nv �뷮 : "+v.capacity()); // v ���� ũ��
		
		int sum = 0;
		
		for(int i=0;i<v.size();i++) {
			int x = v.get(i);
			sum= sum+x;
			System.out.print(x+"  ");
		}
		System.out.println("\nv �� ��ü ��: "+sum);
		v.add(1,5555); //1��° ��ġ�� 5555 �߰�!
		System.out.println(v);
		v.remove(4);
		System.out.println(v);
		
		
		for(Integer z :v) { //�ڷ��� ������(?): �����̸� 
			System.out.print(z+" ");
		}
		System.out.println();
		
		Iterator <Integer> it = v.iterator();
		
		
		while(it.hasNext()) { //for �� ó�� ��� �Ѿ�鼭 �����Ͱ� �ִ��� ������ Ȯ���ϴ� ����.
			int k=it.next();
			System.out.println("�����Ͱ� �ֱ���?");
			System.out.print(k+" ");
		}
		System.out.println();
	}

}
