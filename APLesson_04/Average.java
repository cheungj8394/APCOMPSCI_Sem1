import java.util.Scanner;
public class Average
{
	static double num1;
	static double num2;
	static double num3;
	static double avg;
	
	public static void main(String[]args)
	{
	System.out.println("Enter the first number:");
	Scanner kb=new Scanner(System.in);
	num1=kb.nextDouble();
	System.out.println("Enter the second number:");
	num2=kb.nextDouble();
	System.out.println("Enter the third number:");
	num3=kb.nextDouble();
	average();
	print();
	}
	
	public static void average()
	{
		avg=(num1+num2+num3)/3.0;
	}
	
	public static void print()
	{
		System.out.printf("The average of "+num1+", "+num2+", and "+num3+" is %.5f.",avg);
	}

}
