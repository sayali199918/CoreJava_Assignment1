//13.	Program to find greatest in 3 numbers. [ once using if else statement and then using ternary operator ( logical operator) ]  


package Core_java_Assignment1;

import java.util.Scanner;

public class GreatestNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a First Number");
		int a=sc.nextInt();
		System.out.println("Enter a Second Number");
		int b=sc.nextInt();
		System.out.println("Enter a Third Number");
		int c=sc.nextInt();
		if (a>b && a>c)
		{
			System.out.println(a+"is greatest number" );
		}
		else if(b>a && b>c)
		{
			System.out.println(b+"is greatest number");
		}
		else if(c>a && c>b)
		{
			System.out.println(c+"is greatest number");
		}
		else
		{
			System.out.println("All are equal");
		}
		sc.close();


	}

}
