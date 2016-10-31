import java.util.Scanner;
public class Left Triangle
{
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the number you want to count up to:");
		int max=kb.nextInt();
		System.out.println("Enter the increment:");
		int increm=kb.nextInt();
		
		for(int i=0; i<max;i+=increm)
		{
			System.out.printf(i+increm+"\t");
		}
	}
}