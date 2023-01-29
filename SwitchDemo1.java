package assignments;

import java.util.Scanner;

public class SwitchDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		String size;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entter your shirt size");
		num  = sc.nextInt();
		
		sc.close();
		
		switch(num) {
			case 1:
				case 2:
				case 3:
				case 4:
					
					System.out.println("Short");
					break;
					
				case 5:
					System.out.println("Normal");
					break;
					
				case 6:
					System.out.println("Double xl");
					break;
					
					default:
						System.out.println("it may be any size");
		}

	}

}
