public class OOP_arch
{
	//instance variables
	private String userName, firstName, lastName;
	
	//Default Constructor
	public OOP_arch()
	{
		//default values for instance vars
		userName="";
		firstName="";
		lastName="";
	}
	
	//Constructor with params
	public OOP_arch(String uName,String fName,String lName)
	{
		userName=uName;
		firstName=fName;
		lastName=lName;
	}
	
	//Modifier
	public void setUserName(String uName)
	{
		userName=uName;
	}
	
	//Accessors
	public String getUserName()
	{
		return userName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	
	public static void main(String[]args)
	{
		userNames object= new userNames("proHands","Professor","Handsome");
		
		System.out.println("<<<<<<<<<<<< USER INFO>>>>>>>>>>>>");
		System.out.println("Name: "+object.getFirstName()+" "+object.getLastName);
		System.out.println("User Name: "+object.getUserName());
		
		userNames object1= new userNames();
		
		System.out.println("<<<<<<<<<<<< USER INFO>>>>>>>>>>>>");
		System.out.println("Name: "+object1.getFirstName()+" "+object1.getLastName);
		System.out.println("User Name: "+object1.getUserName());
		
	}
}