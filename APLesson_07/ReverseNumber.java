import java.util.Scanner;
public class ReverseNumber
{
	public static void main(String[]args)
	{
		Scanner kb= new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=kb.nextInt();
		int rev=0;
		System.out.println(num + " reversed is " + getReverse(num, rev));
	
	}
	static int getReverse(int num, int rev)
	{
		while(num>0)
		{
			rev*=10;
			rev+=num%10;
			num/=10;
		}
		return rev;
	}
}