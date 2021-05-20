package Core_java_Assignment1;

import java.util.Scanner;

public class GreatestNo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a First Number");
		int a=sc.nextInt();
		System.out.println("Enter a Second Number");
		int b=sc.nextInt();
		System.out.println("Enter a Third Number");
		int c=sc.nextInt();
		String d= (a>b && a>c)? a+ " is gretest number":(b>a && b>c)? (b+ "is gretest number"): (c + " is gretest number");
		System.out.println(d);
		sc.close();

	}

}
