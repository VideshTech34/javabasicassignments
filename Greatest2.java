package assignments;

import java.util.Scanner;

public class Greatest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two Integer:");
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a>b) {
			System.out.println(a+": is greatest");
		}
		else {
			System.out.println(b+ ": is greatest");
		}
		

	}

}
