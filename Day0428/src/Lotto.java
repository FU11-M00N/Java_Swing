import java.util.HashSet;

public class Lotto {

	public static void main(String[] args) {
		//�ζ�
		
				HashSet<Integer> lo = new HashSet<>();
				
				for(int i=0;i<6;i++) {
					int r= (int) (Math.random()*45+1); //1���� 5����
					
					if(lo.contains(r)) {
						i-=1;
						continue;
					}
					lo.add(r);
				}
				System.out.println(lo);
				
	}

}
