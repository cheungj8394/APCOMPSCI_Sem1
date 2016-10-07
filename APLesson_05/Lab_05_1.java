import java.util.Random;
public class Lab_05_1
{
	public static void main(String[]args)
	{
		Random rand=new Random();
		int playerRoll=rand.nextInt(6)+1;
		int compRoll=rand.nextInt(6)+1;
		System.out.println("You rolled a "+playerRoll);
		System.out.println("The computer rolled a "+compRoll);
		
		if(rollDice(int playerRoll,int compRoll))
		{
			System.out.println("The winner is you.");
		}
	
		if(!rollDice(int playerRoll,int compRoll))
		{
			System.out.println("The winner is the computer.");
		}
			
	}
	public static boolean rollDice(int playerRoll,int compRoll)
	{
		return playerRoll>compRoll;
	}
	
}