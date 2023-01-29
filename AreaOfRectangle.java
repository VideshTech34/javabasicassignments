package assignments;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length and breadth of Rectangle:");
		double l = sc.nextDouble();
		double b = sc.nextDouble();
		
		double area = l*b;
		
		System.out.println("Area of Rectangle : "+area);

	}

}
