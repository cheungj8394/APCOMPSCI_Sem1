import java.util.Scanner;
public class Static1
{

	public static void main(String[]args)
	{
		int width=10;
		int height=15;
		
		perimeter=calcPerim(width,height);
		
		System.out.println("Your perimeter is "+perimeter+"ft.");
	}
	public static void calcPerim(int w, int h)
	{
		return 2*(w+h);
	}
	
}