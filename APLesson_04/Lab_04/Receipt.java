import java.util.Scanner;
public class Receipt
{
	public static void main(String[]args)
	{
		Receipt input= new Receipt();
		System.out.println("Please enter item 1:");
		Scanner keyboard=new Scanner(System.in);
		String item1=keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		double price1=keyboard.nextDouble();
		
		keyboard.nextLine();
		System.out.println("Please enter item 2:");
		String item2=keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		double price2=keyboard.nextDouble();
		
		keyboard.nextLine();
		System.out.println("Please enter item 3:");
		String item3=keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		double price3=keyboard.nextDouble();
		
		double total=price1+price2+price3;
		double tax=total*0.08;
		double all=total+tax;
		
		System.out.println("\n");
		System.out.format("%24s","<<<<<<<Receipt>>>>>>>");
		System.out.format("\n");
		input.format(item1, price1);
		input.format(item2, price2);
		input.format(item3, price3);
		System.out.format("\n");
		input.format("Subtotal:",total);
		input.format("Tax:",tax);
		input.format("Total:",all);
		
	}
	public void format(String item, double price)
	{
		System.out.printf("*%15s ....... %5.2f\n",item, price);
	}
}