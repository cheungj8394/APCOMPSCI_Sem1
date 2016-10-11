import java.util.Scanner;
public class Receipt
{
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("What is item 1?");
		String item1=kb.nextLine();
		System.out.println("What is the price of item 1?");
		double price1=kb.nextDouble();
		System.out.println("What is item 2?");
		kb.nextLine();
		String item2=kb.nextLine();
		System.out.println("What is the price of item 2?");
		double price2=kb.nextDouble();
		System.out.println("What is item 3?");
		kb.nextLine();
		String item3=kb.nextLine();
		System.out.println("What is the price of item 3?");
		double price3=kb.nextDouble();
		System.out.println("What is item 4?");
		kb.nextLine();
		String item4=kb.nextLine();
		System.out.println("What is the price of item 4?");
		double price4=kb.nextDouble();
		
		double subtot=price1+price2+price3+price4;
		double tax=subtot*0.08
	}
}