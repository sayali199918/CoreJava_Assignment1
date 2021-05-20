//11.	Write a program to swap two numbers without using third variable.

package Core_java_Assignment1;

import java.util.Scanner;

public class Swap_Without_temp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first Number");
		int a=sc.nextInt();
		System.out.println("Enter a second Number");
		int b=sc.nextInt();
		System.out.println("Before Swapping");
		System.out.println("a = "+ a + " b = "+ b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping");
		System.out.println("a="+ a + " b =" +b);
		
		sc.close();

	}

}
