import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		//getArray();
		//maxValue();
		randomMax();
	}
	
	static void getArray() {
		
		int a[] = new int [5]; //������ �迭 5��, �⺻�� 0���� ���
		a[0] = 77; a[1] = 66; a[2] = 88; a[3] = 99; a[4] =100;
		System.out.println(a[0]);
		int b[]= {12,23,34,45,56,67,78,89,90};
		for (int i=0; i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println("\n");
		String c[]= {"������", "��ȣ��","������"};
		for(String n : c) { //for-each�� for( �ڷ���: �迭�� )
			System.out.println(n);
		}
		
	}
	static void maxValue() {
		int a[]= new int [5];
		int max=0;
		int min=9999;
		Scanner s = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
			
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.print("���: ");
		for(int n : a) {
			System.out.print(n+" ");
		}
		System.out.println("\n�ִ�: "+max+"\n�ּڰ�: "+min);
		
	}
	static void randomMax() {
		
		
		int a[] = new int [10];
		int sum=0;
		for (int i=0; i<a.length;i++) {

			a[i] = (int)(Math.random()*100+1); //1-10������ ���� ������ ��
			sum+=a[i];
			System.out.print(a[i]+" ");
		}
		System.out.println("\n�������� ��: "+sum+"\n�������� ���: "+(float)sum/a.length);
	}
}
