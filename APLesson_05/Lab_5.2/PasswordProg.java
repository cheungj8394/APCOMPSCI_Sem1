import java.util.Scanner;
public class PasswordProg
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb= new Scanner(System.in);
		passCheck();
	}
	public static void passCheck()
	{
		System.out.println("What is your username?");
		String user= kb.next();
		System.out.println("What is your password?");
		String pass= kb.next();

		if(user.equals("cheungj8394")&&pass.equals("password"))
		{
			System.out.println("You are granted access!!");	
		}
		else
		{
			if(user.equals("cheungj8394")&&!pass.equals("password"))
			{
				System.out.println("Your password is incorrect!");
				passCheck();
			}
			if(!user.equals("cheungj8394")&&pass.equals("password"))
			{
				System.out.println("Your username is incorrect!");
				passCheck();
			}
			else
			{
				System.out.println("Your username and password are incorrect!");
				passCheck();
			}
		}
	}
}