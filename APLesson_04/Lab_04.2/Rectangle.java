import java.util.Scanner;
public class Rectangle
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		System.out.println("Enter the length in ft:");
		Scanner kb=new Scanner(System.in);
		l=kb.nextDouble();
		System.out.println("Enter the width in ft:");
		w=kb.nextDouble();
		calcPerim();
		print();
		
	}
	public static void calcPerim()
	{
		perimeter=2*l+2*w;
	}
	public static void print()
	{
		System.out.println("Your rectangle is "+perimeter+" ft around.");
	}
}