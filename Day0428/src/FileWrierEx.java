import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrierEx {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try{
			fout = new FileWriter("C:\\Users\\user\\Desktop\\¹®È£.txt");
			while(true) {
				String line = s.nextLine();
				if(line.length()==0) {
					break;
				}
				fout.write(line, 2, line.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		s.close();
	}

}
