import java.util.Scanner;
public class GPACalc
{
	public static void main(String[]args)
	{
		Scanner kb= new Scanner(System.in);
		System.out.println("What is your grade in math?");
		String grade1=kb.next();
		System.out.println("What is your grade in chemisty?");
		String grade2=kb.next();
		System.out.println("What is your grade in english?");
		String grade3=kb.next();
		System.out.println("What is your grade in physics?");
		String grade4=kb.next();
		System.out.println("What is your grade in biology?");
		String grade5=kb.next();
		System.out.println("What is your grade in PE?");
		String grade6=kb.next();
		System.out.println("What is your grade in government?");
		String grade7=kb.next();
		
		
		double gpa=(calcPoints(grade1)+calcPoints(grade2)+calcPoints(grade3)+calcPoints(grade4)+calcPoints(grade5)+calcPoints(grade6)+calcPoints(grade7))/7;
		System.out.printf("Your GPA is %.2f",gpa);
	}
	public static double calcPoints(String grade)
	{
		if(grade.equals("A"))
			return 4.0;
		if(grade.equals("B"))
			return 3.0;
		if(grade.equals("C"))
			return 2.0;
		if(grade.equals("D"))
			return 1.0;
		if(grade.equals("F"))
			return 0.0;
		
		return 0.0;
	}
}