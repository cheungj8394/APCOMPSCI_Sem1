public class BiggestNumber
{
	static int [] numbers;
	
	public static void main(String[]args)
	{
		numbers = new int[10];
		fillArray(numbers);
		System.out.println("For the following numbers...");
		printArray(numbers);
		System.out.println("The biggest number is " + getBiggest(numbers));
	}
	
	public static void fillArray(int [] numbers)
	{
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = Math.random()*100;
	}
	
	public static void printArray(int [] numbers)
	{
		for(int number:numbers)
			System.out.println(number+"\t");
	}
	
	public static int getBiggest(int [] numbers)
	{
		int max = 0;
		for(int number:numbers)
		{
			if(number > max)
				max = number;
		}
		return max;
	}
}