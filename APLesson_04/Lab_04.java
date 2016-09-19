import java.util.Scanner;//import Statement
public class Lab_04
{
	public static void main(String[]args)
	{
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
		System.out.format("%10s","Receipt");
		System.out.format("\n");
		System.out.format("\n%15s      %5.2f",item1,price1);
		System.out.format("\n%15s      %5.2f",item2,price2);
		System.out.format("\n%15s      %5.2f",item3,price3);
		System.out.format("\n");
		System.out.format("\n%15s      %5.2f","Subtotal:",total);
		System.out.format("\n%15s      %5.2f","Tax:",tax);
		System.out.format("\n%15s      %5.2f","Total:",all);
		
		
	}
}