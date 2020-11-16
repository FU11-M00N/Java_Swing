import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufText {

	public static void main(String[] args) throws IOException{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader buf = new BufferedReader(in);
		
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("자료를 입력: ");
		String s = buf.readLine();
		System.out.println(s);
	}

}
