import java.util.Scanner;
public class DigitAdder
{
	static int num;
	static int sum=0;
	public static void main(String[]args)
	{
		Scanner kb= new Scanner(System.in);
		System.out.println("Enter a number:");
		num=kb.nextInt();
		System.out.println("The sum of the digits in " + num + " is " + sumDigits());
	}
	static int sumDigits()
	{
		while(num>0)
		{
			sum+=num%10;
			num/=10;
		}
		return sum;
	}
}