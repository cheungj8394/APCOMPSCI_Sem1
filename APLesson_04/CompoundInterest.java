import java.util.Scanner;
public class CompoundInterest
{
	public static void main(String[]args)
	{
	CompoundInterest loan=new CompoundInterest();
	System.out.println("Enter the interest rate:");
	Scanner kb=new Scanner(System.in);
	Double r=kb.nextDouble();
	
	System.out.println("Enter the principal (the original amount you intend to borrow):");
	Double P=kb.nextDouble();
	
	System.out.println("Enter the number of times the loan is compounded per year:");
	Double n=kb.nextDouble();
	
	System.out.println("Enter the life of the loan (in years):");
	Double t=kb.nextDouble();
	

	System.out.format("Your total monthly payment is $%.2f",loan.payment(r,P,n,t));
	}
	
	public double payment(double r,double P,double n, double t)
	{
		return (P*(Math.pow(1+r/n,n*t)))/(t*12);
	}
}