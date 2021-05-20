//04.	Write a program that initializes 2 byte type of variables. Add the values of these variables and store in a byte type of variable. [Note: primitive down casting is required in this program ] .


package Core_java_Assignment1;

public class Sum_Of_Byte {
	public static void main(String args[])
	{
		byte num1=10;
		byte num2=127;
		byte sum;
		sum= (byte) (num1+num2);
		System.out.println("sum= "+sum);
				
	}
}
