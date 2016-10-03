import java.util.Scanner;
public class Cube2
{
	public static void main(String[]args)
	{
		Cube2 sA=new Cube2();
		Scanner kb=new Scanner(System.in);
		System.out.println("What is the length of the side of the cube?");
		double side=kb.nextDouble();
		print(side,calcSurf(side));
	}
	
	public static double calcSurf(double s)
	{
		return 6*s*s;
	}
	
	public static void print(double side,double sA)
	{
		System.out.printf("The surface area of a cube whose sides are %f in length is %.5f",side,sA);
	}
}