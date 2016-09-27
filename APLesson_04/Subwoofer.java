import java.util.Scanner;
public class Subwoofer
{
	public static void main(String[]args)
	{
		Subwoofer Vol=new Subwoofer();
		System.out.println("Enter the height in inches:");
		Scanner kb=new Scanner(System.in);
		Double height=kb.nextDouble();
		
		System.out.println("Enter the length in inches:");
		Double length=kb.nextDouble();
		
		System.out.println("Enter the width in inches:");
		Double width=kb.nextDouble();
		
		Double fvol=Vol.calcVol(height,length,width)/1728;
		
		System.out.printf("The volume of the Subwoofer box is %.2f cubic feet",fvol);
	}
	public double calcVol(double h, double l, double w)
	{
		return h*l*w;
	}
}