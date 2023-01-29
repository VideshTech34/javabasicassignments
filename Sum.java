package assignments;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1,n,sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		
		n = sc.nextInt();
		
		
		while(i<=n) {
			sum = sum+i;
			
			i = i+1;
			
			System.out.println("The Sum of the Series is : "+sum);
			
		}
		
		System.out.println("The Sum of the Series is : "+sum);
	}

}
