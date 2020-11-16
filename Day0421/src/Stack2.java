import java.util.Scanner;
import java.util.Stack;

public class Stack2 {
	static Scanner sc = new Scanner(System.in);
	static Stack <String> stack1 = new Stack<>();
	static Stack <String> stack2 = new Stack<>();
	
	public static void main(String[] args) {
		
		
		while(true) {
			System.out.println("번호를 누르시던가");
			switch(sc.nextInt()) {
			case 1:
				adds();
				break;
			case 2:
				back();
				break;
			case 3:
				foward();
				break;
			case 4:
				show();
				break;
			case 5:
				sc.close();
				System.exit(0);
			}
			
		}
	}
	
	static void adds() {
		System.out.println("넣을 값 입력:");
		stack1.push(sc.next());
	}
	static void back() {
		
		stack2.push(stack1.pop());
	}
	static void foward() {
		stack1.push(stack2.pop());
	}
	static void show() {
		System.out.println("stack 1:\n"+stack1+"\nstack 2: \n"+stack2);
	}

}
