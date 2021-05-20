//08.	Write a program to find the simple interest. Take the principle amount, rate of interest and time from user using Scanner class


package Core_java_Assignment1;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		float p,n,r,SI;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Principle amount");
		p=sc.nextFloat();
		System.out.println("Enter the Rate of Interest");
		r=sc.nextFloat();
		System.out.println("Enter the  Number of year");
		n=sc.nextFloat();
		SI=(p*n*r)/100;
		System.out.println("Simple interest is= "+SI);
		sc.close();

	}

}
