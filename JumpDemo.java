package assignments;

public class JumpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j;
		
		for(i=1;i<=10;i++) {
			if(i==8) {
				continue;
			}
			
			System.out.println(i);
		}
		
		System.out.println("************ Continue Demo **************");
		
		
		for(j=0;j<=10;j++) {
			if(j==3) {
				continue;
			}
			
			System.out.println(j+ "Java");
		}

	}

}
