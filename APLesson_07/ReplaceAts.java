import java.util.Scanner;
public class ReplaceAts
{
	public static void main(String[]args)
	{
		Scanner kb= new Scanner(System.in);
		System.out.println("Write a sentence:");
		String sent= kb.nextLine();
		System.out.println(replace(sent));
	}
	public static String replace(String sent)
	{
		while(sent.indexOf("a")>=0)
		{
			sent=sent.substring(0,sent.indexOf("a"))+"@"+sent.substring(sent.indexOf("a")+1,sent.length());
		}
		return sent;
	}
}