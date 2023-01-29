package assignments;

import java.util.Scanner;

public class OccurenceOfArray {
	
	static int countOccurence(int arr[],int x) {
		
		int n = arr.length;
		
		int count =0;
		for(int i =0;i<n;i++) {
			if(arr[i]>x) {
				count++;
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		
		int n = sc.nextInt();
		
		System.out.println("Enter the Array Elements :");
		
		int arr[] = new int[n];
		
		for(int i = 0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
			
		}
		
		System.out.println(" Enter x");
		
		int x = sc.nextInt();
		System.out.println("Strictly greater "+countOccurence(arr,x));
		

	}

}
