public class GetOdds
{
	static int [] numbers;
	
	public static void main(String[]args)
	{
		numbers = new int[10];
		fillArray(numbers);
		System.out.println("For the following numbers...");
		printArray(numbers);
		System.out.println(getOdds(numbers)+" are odd numbers");
	}
	
	public static void fillArray(int [] numbers)
	{
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) +1;
		}
	}
	
	public static void printArray(int [] numbers)
	{
		for(int number: numbers)
		{
			System.out.print(number);
		}
	}
	
	public static String getOdds(int [] numbers)
	{
		String odds = "";
		for(int number: numbers)
		{
			if(number%2==1)
				odds += number + " ";
		}
		return odds;
	}
}