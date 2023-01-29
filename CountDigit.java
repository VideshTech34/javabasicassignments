package assignments;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		 
		  int rev =0;
		 
		 System.out.println("Enter the number : ");
		 
		 int n = sc.nextInt();
		 
		 while(n>0) {
			 
			 int rdigit = n%10;
			 
			 rev  = rev*10+rdigit;
			 n = n/10;
			 
		 }
		 System.out.println(rev);
		 
		 
		 

	}

}
