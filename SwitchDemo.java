package assignments;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a,b,res;
		String op;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two Number:");
		
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Enter an operator");
		op = sc.next();
		sc.close();
		
		switch(op)
		{
			case "+": res = a+b;
			System.out.println("the addition of two number :"+res);
			break;
			
			case "-": res = a-b;
			System.out.println("the subtraction of two number :"+res);
			break;
			
			case "*": res = a*b;
			System.out.println("the Multiplication of two number :"+res);
			break;
			
			case "/": res = a/b;
			System.out.println("the division of two number :"+res);
			break;
		}

	}

}
