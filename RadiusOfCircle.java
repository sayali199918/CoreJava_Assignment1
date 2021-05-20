//06.	Write a program that takes radius of a circle as input. Read the entered radius using Scanner class. Then calculate and print the area and circumference of the circle.

package Core_java_Assignment1;

import java.util.Scanner;

public class RadiusOfCircle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double pi=3.14,r,a,c;
		System.out.println("Enter the value of Radius");
		r=sc.nextDouble();
		a=3.14*r*r;
		c=2*3.14*r;
		System.out.println("Area of circle= "+a);
		System.out.println("Circumference of circle="+c);
		sc.close();
	}

}
