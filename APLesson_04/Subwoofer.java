import java.util.Scanner;
public class Subwoofer
{
	public static void main(String[]args)
	{
		Subwoofer calc=new Subwoofer();
		System.out.println("Enter the height:");
		Scanner kb=new Scanner(System.in);
		Double height=kb.nextDouble();
		
		System.out.println("Enter the length:");
		Double length=kb.nextDouble();
		
		System.out.println("Enter the width:");
		Double width=kb.nextDouble();
		
		System.out.println("The volume of the Subwoofer box is %f",calc.calcVol(height,length,width));
	}
	public double calcVol(double h, double l, double w)
	{
		return h*l*w;
	}
}