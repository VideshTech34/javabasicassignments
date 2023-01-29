package assignments;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Sentence");
		
		String s = sc.nextLine();
		
		int count=0;
		
		System.out.println("Length of the String : "+s.length());
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				
				count=count+1;
				
				System.out.println("vowels found in String "+s.charAt(i));
			}
		}
		
		System.out.println("Total Numbers of Vowel found in String :"+count);
		
		
	}
}