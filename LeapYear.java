//14.	Program to check that entered year is a leap year or not.
package Core_java_Assignment1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Year");
		int Year=sc.nextInt();
		if((Year%400==0) || (Year%4==0 && Year%100!=0))
		{
			System.out.println(Year + "is a Leap year");
		}
		else
		{
			System.out.println(Year + "is not a Leap year");
		}
		sc.close();

	}

}
