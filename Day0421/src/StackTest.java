import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack <Integer> s = new Stack<>();
		
		s.push(3);
		s.push(11);
		s.push(77);
		System.out.println(s);
		s.pop();
		System.out.println(s+"\n현재 위치의 값: "+s.peek());


	}
x
}
