import java.util.Scanner;
public class BMIPart2
{
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter your height in inches:");
		double height=kb.nextDouble();
		System.out.println("Enter your weight in lbs:");
		double weight=kb.nextDouble();
		double bmi=weight*703/(height*height);
		System.out.println("Your BMI is: "+bmi);
		String condition=calcCondish(bmi);
		System.out.println("You are "+condition);
	}
	public static String calcCondish(double bmi)
	{
		String condition="";
		if (bmi<18.5)
			return "Underweight";
		else if (bmi<=24.9)
			return "Normal";
		else if (bmi<=29.9)
			return "Normal";
		else if (bmi<=34.9)
			return "Obese";
		else if (bmi<=39.9)
			return "Very Obese";
		else if (bmi>39.9)
			return "Morbidly Obese";
		return "";
	}
}