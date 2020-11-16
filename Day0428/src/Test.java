import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		FileWriter fout = null,fout2=null;
		String namelist = "";
		FileReader fin = null;
		ArrayList<String> na = new ArrayList<>();
		
		try{
			fout = new FileWriter("C:\\Users\\user\\Desktop\\name.txt");

			for(int i=0;i<6;i++) {
				System.out.println((i+1)+"번째 이름 입력:");
				String name=s.nextLine();
				na.add(name);
				fout.write(name, 0, name.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
			fin =new FileReader("C:\\Users\\user\\Desktop\\name.txt");
			fout2= new FileWriter("C:\\Users\\user\\Desktop\\namelist.txt");
	         int c;
	         while((c= fin.read()) != -1) { // 한 문자씩 파일 끝까지 읽기
	            namelist=namelist+(char)c;
	         }
	         
			fout2.write(namelist,0,namelist.length());
			fout2.close();
	        fin.close();
			System.out.println(na);
			fout.close();
		}catch(IOException e) {
			e.printStackTrace();
		} 
		s.close();

	}

}
