import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Haha {

   public static void main(String[] args) {
      Vector <Integer> v1 = new Vector<Integer>();
      Vector <Double> v2 = new Vector<Double>();
      Vector <String> v3 = new Vector<>();
      Vector v4 = new Vector<>();
      v4.add("����");
      v4.add(5);
      v4.add(6.8); //add�� �߰� �ϱ�
      System.out.println(v4);
      
      ArrayList <String> a1=new ArrayList<>();
      a1.add("���"); a1.add("������"); a1.add("����"); a1.add("��");
      
      System.out.print("���ڿ� ��� : ");
      for(int i=0; i<a1.size(); i++)
      {
      String j =a1.get(i);
      System.out.print("["+j+"]");
      }
      System.out.print("\nIterator����ϱ� :");
      Iterator<String> it = a1.iterator();
      while(it.hasNext())
      {
      
         String j = it.next();
         System.out.print("["+j+"] ");
      }         
      System.out.print("\nfor�� ����ϱ� :");
      for(String s:a1)
      {
         System.out.print("["+s+"] ");
      }

      Collections.sort(a1);  //sort�� ������ ���ڸ� �������ش�. �� �� �� ������
      System.out.print("\n�����ϱ�(�����ټ�) >> "+a1);
      Collections.reverse(a1);//����
      System.out.print("\n���� ���� >>>"+a1);
      System.out.print("\n�˻��ϱ� (���° ������ ����� �ִ�?) >>> ");
      System.out.println(Collections.binarySearch(a1,"���"));//a1�� ������ �ܾ �ִ��� �˻�
      //System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      
      ArrayList <String> a2=new ArrayList<>(); 
      Scanner sc = new Scanner(System.in);
      String s;//�Է¹޴� ��
      String sum; //���� �ο�
      while(true) {
         System.out.println("======================");
         System.out.println("     1. ȸ���Է�");
         System.out.println("     2. ȸ�����");
         System.out.println("     3. ȸ���˻�");
         System.out.println("     4. ����");
         System.out.println("======================");
         System.out.print("��ȣ�� �Է��ϼ��� >>>");
         s=sc.next();
         
         switch(s) {
         case "1" :
            System.out.println("======================");
            System.out.print("ȸ���Է� >>>");
            s=sc.next();
            a2.add(s);
            System.out.println("\n�߰��� �ο� :"+s);
            break;
         case "2" : 
            System.out.println("======================");
            System.out.println("������� �ִ� ȸ���� >>>\n");
            System.out.println(a2);
            break;
         case "3" :
            System.out.println("======================");
            System.out.print("�˻��� �̸� >>>");
            s=sc.next();
            boolean b=false;
            //if���� Equals �޼ҵ� ����ϱ� --> Equals�� contentEquals ���� �˾ƺ��� //���� ����ִ��� �ƴ��� Ȯ�����ִ� �޼ҵ� 
            //if(s.contentEquals(a2.get()==true)) {//equals �޼ҵ� ��� ==> ���� ����ִ��� �ƴ��� Ȯ�����ִ� �޼ҵ�  / get -> �������ڴ�.
            for(String n :a2) {
            	if(n.equals(s)) {
            		System.out.println("�� ����");
                    System.out.println(Collections.binarySearch(a2,s)+"��°�� ���� �ֽ��ϴ�.");//a2�� ���� �Է��� ���� �ִ��� Ȯ��

            		b=true;
            		break;
            	}
            }
            if(b==false) {
            	System.out.println("�� ����");
            }
            
         }
         
      }

   }

}
/*   a2.add("ȫ�浿"); a2.add("ȫ���"); a2.add("����"); a2.add("����");a2.add("�׻���");
System.out.println(a2);
Scanner sc= new Scanner(System.in);
System.out.print("�˻��� �̸� ? :");
String s=sc.next();

for(int i=0; i<a2.size(); i++){
String j =a2.get(i);
System.out.println(Collections.binarySearch(a2,s));   
}
*/