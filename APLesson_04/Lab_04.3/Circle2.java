import java.util.Scanner;
public class Circle2
{
	public static void main(String[]args)
	{
		Circle2 area=new Circle2();
		Scanner kb=new Scanner(System.in);
		System.out.println("What is the length of the radius?");
		double radius=kb.nextDouble();
		print(radius,calcArea(radius));
	}
	
	public static double calcArea(double r)
	{
		return 3.14*r*r;
	}
	
	public static void print(double radius,double area)
	{
		System.out.printf("The area of a circle with a radius of %f is %.5f",radius,area);
	}
}