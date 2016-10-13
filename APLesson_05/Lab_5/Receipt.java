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
		double discount= calcDisc(subtot);
		double tax=subtot*0.08;
		double total=subtot-discount+tax;
		
		System.out.println("<<<<<Receipt>>>>>");
		System.out.printf("\n");
		format(item1,price1);
		format(item2,price2);
		format(item3,price3);
		format(item4,price4);
		System.out.printf("\n");
		System.out.printf("%10s %4.2f\n","Subtotal:",subtot);
		System.out.printf("%10s %4.2f\n","Discount:",discount);
		System.out.printf("%10s %4.2f\n","Tax:",tax);
		System.out.printf("%10s %4.2f\n","Total:",total);
		System.out.printf("\n");
		System.out.println("Thank you for shopping with us today :)");
	}
	public static double calcDisc(double subtot)
	{
		if(subtot>=2000)
			return subtot*0.15;
		return 0.0;
	}
	public static void format(String item,double price)
	{
		System.out.printf("%10s %4.2f\n",item,price);
	}
}