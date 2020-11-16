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
      v4.add("문자");
      v4.add(5);
      v4.add(6.8); //add로 추가 하기
      System.out.println(v4);
      
      ArrayList <String> a1=new ArrayList<>();
      a1.add("사과"); a1.add("복숭아"); a1.add("포도"); a1.add("귤");
      
      System.out.print("문자열 출력 : ");
      for(int i=0; i<a1.size(); i++)
      {
      String j =a1.get(i);
      System.out.print("["+j+"]");
      }
      System.out.print("\nIterator사용하기 :");
      Iterator<String> it = a1.iterator();
      while(it.hasNext())
      {
      
         String j = it.next();
         System.out.print("["+j+"] ");
      }         
      System.out.print("\nfor문 사용하기 :");
      for(String s:a1)
      {
         System.out.print("["+s+"] ");
      }

      Collections.sort(a1);  //sort는 정렬임 문자를 정렬해준다. 가 나 다 순서로
      System.out.print("\n정렬하기(가나다순) >> "+a1);
      Collections.reverse(a1);//역순
      System.out.print("\n역순 정렬 >>>"+a1);
      System.out.print("\n검색하기 (몇번째 순서에 사과가 있니?) >>> ");
      System.out.println(Collections.binarySearch(a1,"사과"));//a1에 사과라는 단어가 있는지 검색
      //System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      
      ArrayList <String> a2=new ArrayList<>(); 
      Scanner sc = new Scanner(System.in);
      String s;//입력받는 값
      String sum; //누적 인원
      while(true) {
         System.out.println("======================");
         System.out.println("     1. 회원입력");
         System.out.println("     2. 회원출력");
         System.out.println("     3. 회원검색");
         System.out.println("     4. 종료");
         System.out.println("======================");
         System.out.print("번호를 입력하세요 >>>");
         s=sc.next();
         
         switch(s) {
         case "1" :
            System.out.println("======================");
            System.out.print("회원입력 >>>");
            s=sc.next();
            a2.add(s);
            System.out.println("\n추가된 인원 :"+s);
            break;
         case "2" : 
            System.out.println("======================");
            System.out.println("현재까지 있는 회원들 >>>\n");
            System.out.println(a2);
            break;
         case "3" :
            System.out.println("======================");
            System.out.print("검색할 이름 >>>");
            s=sc.next();
            boolean b=false;
            //if문에 Equals 메소드 사용하기 --> Equals랑 contentEquals 차이 알아보기 //값이 들어있는지 아닌지 확인해주는 메소드 
            //if(s.contentEquals(a2.get()==true)) {//equals 메소드 사용 ==> 값이 들어있는지 아닌지 확인해주는 메소드  / get -> 가져오겠다.
            for(String n :a2) {
            	if(n.equals(s)) {
            		System.out.println("값 있음");
                    System.out.println(Collections.binarySearch(a2,s)+"번째에 값이 있습니다.");//a2에 내가 입력한 값이 있는지 확인

            		b=true;
            		break;
            	}
            }
            if(b==false) {
            	System.out.println("값 없음");
            }
            
         }
         
      }

   }

}
/*   a2.add("홍길동"); a2.add("홍길순"); a2.add("콩쥐"); a2.add("팥쥐");a2.add("뿡뿡이");
System.out.println(a2);
Scanner sc= new Scanner(System.in);
System.out.print("검색할 이름 ? :");
String s=sc.next();

for(int i=0; i<a2.size(); i++){
String j =a2.get(i);
System.out.println(Collections.binarySearch(a2,s));   
}
*/