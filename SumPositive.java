package assignments;

import java.util.Scanner;

public class SumPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Numbers :");
		
		a = sc.nextInt();
		
		while(a>=0) {
			sum = sum+a;
			
		System.out.println("Enter a Number :");
		 a = sc.nextInt();
			
			
			
		}
		
		System.out.println("sum of positive Number : "+sum);

	}

}
