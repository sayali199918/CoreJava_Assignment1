//15.Accept person’s gender (character m for male and f for female), age (integer), as input and then check whether person is eligible for marriage or not.

package Core_java_Assignment1;
import java.util.Scanner;

public class Gender {

	public static void main(String[] args) {
		Input obj1=new Input();
		obj1.marriage();

	}

}
class Input
{
	private char a;
	private int age;
	
	void marriage()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your gender Female= F or Male= M");
		a=sc.next().charAt(0);
		System.out.println("Enter your age");
		age=sc.nextInt();
		if ( a == 'F' && age > 21 )
		{
			System.out.println("Your age is valid");
			
		}
		else if( a== 'M' && age > 18)
		{
			System.out.println("Your age is valid");
			
		}
		else
		{
			System.out.println("Your age is not valid");
		}
		sc.close();
	}
}
