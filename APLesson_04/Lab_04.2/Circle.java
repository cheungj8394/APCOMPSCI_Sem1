import java.util.Scanner;
public class Circle
{
	static double r;
	static double Area;
	
	public static void main(String[]args)
	{
		System.out.println("What is the radius of the circle?");
		Scanner kb=new Scanner(System.in);
		r=kb.nextDouble();
		calcArea();
		print();
	}
	
	public static void calcArea()
	{
		Area=3.14*r*r;
	}
	
	public static void print()
	{
		System.out.printf("The area of a circle with a radius of %f is %.5f",r,Area);
	}
}