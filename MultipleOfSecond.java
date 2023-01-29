package assignments;

import java.util.Scanner;

public class MultipleOfSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two Integer : ");
		
		
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(b%a==0) {
			System.out.println(a+" is the multiple of "+b);
			
		}
		else {
			System.out.println(a+" is not the multiple of "+b);
		}

	}

}
