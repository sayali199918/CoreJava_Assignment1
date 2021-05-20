//10.	Write a program to convert temperature from Fahrenheit to Celsius. Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]


package Core_java_Assignment1;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		  Scanner sc= new Scanner (System.in);
		  System.out.println("Enter temperature in Fahrenheit");
		  double f=sc.nextDouble();
		  double Celsius = (5*(f-32))/9;
		  System.out.println(Celsius);
		  sc.close();
	}

}
