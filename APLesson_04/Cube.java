import java.util.Scanner;
public class Average
{
	static double side;
	static double sA;

	
	public static void main(String[]args)
	{
	System.out.println("Enter the length of the side:");
	Scanner kb=new Scanner(System.in);
	side=kb.nextDouble();
	average();
	print();
	}
	
	public static void calcSurf()
	{
		sA=6*side*side;
	}
	
	public static void print()
	{
		System.out.printf("The average of "+num1+", "+num2+", and "+num3+" is %.5f.",avg);
	}

}