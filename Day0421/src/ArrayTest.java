import java.util.ArrayList;
import java.util.Iterator;

class Person{
	private String name;
	private int age;
	private String city;
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	String getCity() {
		return city;
	}
	Person(String name, int age, String city){
		this.name=name; this.age=age; this.city=city;
	}
}

public class ArrayTest {

	public static void main(String[] args) {
		ArrayList <Person> ar = new ArrayList<>();
		ar.add(new Person("¸ÚÀïÀÌÀººñ",44,"Á¦ÁÖµµ"));
		ar.add(new Person("¸ÚÀïÀÌÈ£ÁØ",55,"¼­¿ï"));
		ar.add(new Person("¸ÚÀïÀÌ½ÂÈ£",66,"ºÎ»ê"));
		ar.add(new Person("¸ÚÀïÀÌ´ë¿ø",77,"´ë±¸"));
		
		Iterator <Person> it = ar.iterator();
		
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println("********  "+p.getName()+" "+p.getAge()+" "+p.getCity()+"  ********");
		}
	}

}
