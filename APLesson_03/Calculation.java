import java.util.Scanner;
public class Calculation
{
	public static void main(String[]args)
	{
		Scanner keyboard=new Scanner(System.in);
		System.out.println("How many inches is the width of your rectangle?");
		int w=keyboard.nextInt();
		System.out.println("How many inches is the height of your rectangle?");
		int h=keyboard.nextInt();
		
		int x=w*h;
	
		System.out.println("The area of your rectangle is "+x+".");
		
	}
	
}