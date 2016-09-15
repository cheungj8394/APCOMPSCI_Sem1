import java.util.Scanner;
public class BMI
{
	public static void main(String[]args)
	{
		Scanner keyboard=new Scanner(System.in);
		System.out.println("How tall are you? (in inches)");
		double height=keyboard.nextDouble();
		System.out.println("How heavy are you?(in lb)");
		double weight=keyboard.nextDouble();
		
		double x=height*height;
		double bmi=703*weight/x;
		System.out.println("Your BMI is "+bmi+".");
		
	}
}


