package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {11,33,45,53,55,643,43};
		
		int i;
		
		System.out.println("********* Array Contents ************");
		
		for(i=0;i<num.length;i++) {
			System.out.println("Array : "+num[i]);
			
		}
		
		System.out.println("The size of an array : "+num.length);
		System.out.println("First Element of an array :"+num[0]);
		System.out.println("Last element of an array : "+num[num.length-1]);
		
	
		System.out.println("Enter Value to array at run time");
		
		int n,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2nd Array size :");
		n=sc.nextInt();
		
		int num1[] = new int[n];
		
		System.out.println("Enter Array size : ");
		
		for(j=0;j<n;j++)
		{
			num1[j]=sc.nextInt();
		}
		
		System.out.println("*************** Array Contents **************");
		for(j=0;j<num1.length;j++) {
			System.out.println(num[j]+ " ");
		}
		
		System.out.println();
		
		System.out.println("Display array contents without loops");
		System.out.println(Arrays.toString(num1));
			
		
	}

}
