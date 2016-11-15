import java.util.Scanner;
public class Lesson_09
{
	public static void main(String[]args)
	{
		Scanner kb= new Scanner(System.in);
		String [] names= new String[5];
		System.out.println("Please enter 5 names:");
		
		for(int i=0; i<names.length; i++)
		{
			names[i]=kb.next();
		}
		
		for(String name:names)
		{
			System.out.print("\""+name.length()+"\",");
		}
	}
}