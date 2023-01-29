package assignments;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three Integer : ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int sum = a+b+c;
		float avg = sum/3;
		int product = (a*b*c);
		
		System.out.println("Sum: "+sum+" Average:"+avg+ "Product:"+product);
		System.out.println();
		if(a<b&& a<c) {
			
		
			System.out.println("Smallest Number is  : "+a);
			
		}
		else if (b<a && b<c){
			
			System.out.println("Smallest  Number is  :"+b);
			
		}
		else {
			System.out.println("Smallest Number : "+c);
			
		}

	}

}
