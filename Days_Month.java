//09.	Write a program to read the days (eg. 670 days) as integer value using Scanner class. Now convert the entered days into complete years, months and days and print them.

package Core_java_Assignment1;
import java.util.*;
public class Days_Month {

	public static void main(String[] args) {
		    int days;
	       Scanner sc= new Scanner(System.in);
	       System.out.println("enter days");
	       days=sc.nextInt();
	       int year = days /360;
	       days= days % 360;
	       System.out.println("Number of years =" + year);
	       int month=days/12;
	       days= days % 12;
	       System.out.println("Number of month = " + month);
	       System.out.println("Number of days = "+ days);
	       sc.close();
	}

}
