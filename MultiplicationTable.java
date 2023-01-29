package assignments;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		
		int n = sc.nextInt();
		
		int i=1;
		
		System.out.println("Multiplication table of "+n+ "is ");
		
		do {
			System.out.println(n+ "*"+i+" = "+(n*i));
			i=i+1;
		}while(i<=10);
		
		

	}

}
