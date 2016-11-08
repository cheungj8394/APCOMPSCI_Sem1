import java.util.Scanner;
public class AverageDigits
{
	public static void main(String[]args)
	{
		Scanner kb= new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=kb.nextInt();
		int digits=0;
		int average=0;
		System.out.println("The average of the digits in " + num + " is " + avDigits(num, average, digits));
	}
	
	static int avDigits(int num, int average, int digits)
	{
		while(num>0)
		{
			digits+=1;
			average+=digits%10;
			num/=10;
			
		}
		return average/digits;
	}
}