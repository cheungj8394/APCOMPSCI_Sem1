import java.util.Scanner;
public class Average2
{
	public static void main(String[]args)
	{
		Average2 average=new Average2();
		Scanner kb=new Scanner(System.in);
		System.out.println("What is the first number?");
		double num1=kb.nextDouble();
		System.out.println("What is the second number?");
		double num2=kb.nextDouble();
		System.out.println("What is the third number?");
		double num3=kb.nextDouble();
		print(num1,num2,num3,calcAverage(num1,num2,num3));
	}
	public static double calcAverage(double one, double two, double three)
	{
		return (one+two+three)/3.0;
	}
	public static void print(double num1, double num2, double num3,double average)
	{
		System.out.printf("The average is of %f,%f,and %f is %.5f",num1,num2,num3,average);
	}
}