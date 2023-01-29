package assignments;

import java.util.Scanner;

public class ForDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number : ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			sum=sum+i;
			
			
		}
		
		System.out.println("sum of two Number  ;"+sum);

	}

}
