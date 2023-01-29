package assignments;

import java.util.Scanner;

public class Greatest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three Numbers");
		
		a= sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		sc.close();
		
		//logical operators are used to combine multiple conditions
		// && -All conditions should be TRUE
		
		
		if(a>b && a>c) {
			System.out.println(a+" is Greatest");
			
		}
		else if(a==b) {
			System.out.println("A & B are Equal");
		}
		else if(b>c)
		{
			System.out.println(b+"is Greatest");
		}
		else if(a==b && b==c) {
			System.out.println("All numbers are equal");
		}
		else {
			System.out.println(c+"is Greatest");
		}

	}

}
