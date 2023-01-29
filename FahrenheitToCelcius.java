package assignments;

import java.util.Scanner;

public class FahrenheitToCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double fahrenheit;
		double celcius;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the fahrenheit Value : ");
		fahrenheit = sc.nextDouble();
		
		celcius = ((fahrenheit-32)*5)/9;
		System.out.println("celcius value of temprature : "+celcius);

	}

}
