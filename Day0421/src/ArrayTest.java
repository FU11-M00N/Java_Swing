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
		ar.add(new Person("����������",44,"���ֵ�"));
		ar.add(new Person("������ȣ��",55,"����"));
		ar.add(new Person("�����̽�ȣ",66,"�λ�"));
		ar.add(new Person("�����̴��",77,"�뱸"));
		
		Iterator <Person> it = ar.iterator();
		
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println("********  "+p.getName()+" "+p.getAge()+" "+p.getCity()+"  ********");
		}
	}

}
