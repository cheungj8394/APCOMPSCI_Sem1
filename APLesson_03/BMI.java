import java.util.Scanner;
public class BMI
{
	public static void main(String[]args)
	{
		System.out.println("How tall are you? (in inches)");
		int h=keyboard.nextInt();
		System.out.println("How heavy are you?(in lb)");
		int w=keyboard.nextInt();
		int x=h*h;
		int b=w/x;
		System.out.println("Your BMI is "+b+".");
	}
}