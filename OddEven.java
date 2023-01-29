package assignments;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ODD\tEVEN");
		System.out.println("------------\t------");
		int i =1;
		while(i<=10) {
			if(i%2==1) {
				System.out.println(i);
			}
			else {
				System.out.println("\t"+i);
			}
			i=i+1;
		}

	}

}
