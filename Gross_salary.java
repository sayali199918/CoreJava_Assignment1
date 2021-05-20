//12.	In a company an employee is paid as under: If his basic salary is less than Rs. 10000, then HRA = 10% of basic salary and DA = 90% of basic salary. If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary. If the employee's salary is input by the user write a program to find his gross salary. [ formula : GS= Basic + DA + HRA ]


package Core_java_Assignment1;

import java.util.Scanner;

public class Gross_salary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double Salary;
		System.out.println("Enter your Salary");
		Salary=sc.nextDouble();
		if (Salary < 10000)
		{
			double HRA,DA,Gs;
			DA=Salary*0.9;
			HRA=Salary*0.1;
			Gs=Salary+DA+HRA;
			System.out.println("Your gross salary is= "+Gs);
			
		}
		else 
		{
			double HRA,DA,Gs;
			DA=Salary*0.98;
			HRA=2000;
			Gs=Salary+DA+HRA;
			System.out.println("Your gross salary is= "+Gs);
			sc.close();
		}

	}

}
