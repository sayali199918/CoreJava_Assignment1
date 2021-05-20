//07.	Write a program to calculate sum of 5 subject’s marks & find percentage. Take the obtained marks from user using Scanner class. Output should be in this format [ percentage marks = 99 % ]. Use concatenation operator here.


package Core_java_Assignment1;
import java.util.*;
public class Sum_Percentage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float sum=0.0f;
		float a []=new float[6];
		for (int i=1;i<a.length;i++)
		{
			  System.out.println("Enter the marks of "+i+ " subject");
	            a [i]= sc.nextFloat();
		}
		 for (float x : a)
	        {
	           sum=sum +  x;
	        }
	           float per = sum /5;
	           float per1= (sum/500)*100;
	           System.out.println("percentage marks ="+ per1 + "%");
	           sc.close();
	           }

}
