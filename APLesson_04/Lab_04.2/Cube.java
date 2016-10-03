import java.util.Scanner;
public class Cube
{
	static double side;
	static double sA;

	
	public static void main(String[]args)
	{
	System.out.println("Enter the length of the side:");
	Scanner kb=new Scanner(System.in);
	side=kb.nextDouble();
	calcSurf();
	print();
	}
	
	public static void calcSurf()
	{
		sA=6*side*side;
	}
	
	public static void print()
	{
		System.out.printf("The surface area of a cube whose sides are %f in length is %.5f",side,sA);
	}

}