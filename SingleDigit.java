package assignments;

import java.util.Scanner;

public class SingleDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		a = sc.nextInt();
		sc.close();
		
		//&& - Logical Operators-> Combine multiple conditions
		// && AND operator -- all conditions should be true
		
		if(a>=0 && a<=9) {
			System.out.println(a+ " is single digit number");
			
		}
		else {
			System.out.println("not a single digit number");
		}
		
		
		
		
	}

}
