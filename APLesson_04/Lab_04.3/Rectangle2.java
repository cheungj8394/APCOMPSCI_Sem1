import java.util.Scanner;
public class Rectangle2
{
	public static void main(String[]args)
	{
		Rectangle2 perimeter=new Rectangle2();
		Scanner kb=new Scanner(System.in);
		System.out.println("What is the length of the rectangle?");
		double length=kb.nextDouble();
		System.out.println("What is the width of your rectangle?");
		double width=kb.nextDouble();
		print(calcPerim(length,width));
	}
	
	public static double calcPerim(double l, double w)
	{
		return 2*(l+w);
	}
	
	public static void print(double perimeter)
	{
		System.out.printf("The perimeter of your rectangle is %.5f",perimeter);
	}
}