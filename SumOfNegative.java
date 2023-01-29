package assignments;

import java.util.Scanner;

public class SumOfNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n,sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		
		n = sc.nextInt();
		while(n<=0) {
			sum = sum+n;
			
			System.out.println("Enter a Number : ");
			n=sc.nextInt();
		}
		
		System.out.println("sum of negative Number : "+sum);		
	}

}
