public class OOP_arch
{
	private String userName, firstName, lastName;
	

	public OOP_arch()
	{
		userName="";
		firstName="";
		lastName="";
	}
	

	public OOP_arch(String uName,String fName,String lName)
	{
		userName=uName;
		firstName=fName;
		lastName=lName;
	}
	
	public void setUserName(String uName)
	{
		userName=uName;
	}

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