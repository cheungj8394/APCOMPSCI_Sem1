public class CourseSort
{
	private String[] courses;
	private int language, math, science, humanities, business, art, tech = 0;
	private String majors = "";
	
	public CourseSort()
	{
		courses = new String[4];
	}
	
	public CourseSort(String[] c)
	{
		courses = c.clone();
		
		for(String s: courses)
		{
			CategoryCount(s);
		}
		
		FindMajor(language, math, science, humanities, business, art, tech);
	}
	
	public void CategoryCount(String c)
	{
		if(c.equals("AP Chinese") ||
		   c.equals("AP French") ||
		   c.equals("AP Japanese") ||
		   c.equals("AP Spanish"))
		   {
			   language++;
		   }
		if(c.equals("AP Calculus AB") ||
		   c.equals("AP Calculus BC") ||
		   c.equals("AP Statistics"))
		   {
			   math++;
		   }
		if(c.equals("AP Biology") ||
		   c.equals("AP Chemistry") ||
		   c.equals("AP Environmental Science") ||
		   c.equals("AP Physics 1") ||
		   c.equals("AP Physics 2") ||
		   c.equals("AP Physics C"))
		   {
			   science++;
		   }
		if(c.equals("AP Art History") ||
		   c.equals("AP European History") ||
		   c.equals("AP Government") ||
		   c.equals("AP Language and Composition") ||
		   c.equals("AP Literature and Composition") ||
		   c.equals("AP U.S. History") ||
		   c.equals("AP World History") ||
		   c.equals("AP Psychology"))
		   {
			   humanities++;
		   }
		if(c.equals("AP Economics"))
		   {
			   business++;
		   }
		if(c.equals("AP Studio Art"))
		   {
			   art++;
		   }
		if(c.equals("AP Computer Science"))
		   {
			   tech++;
		   }
	}
	
	public void FindMajor(int lang, int math, int sci, int hum, int bus, int art, int tech)
	{
		if(lang > 0)
		{
			majors = majors + "\nEnglish";
		}
		if(math > 0)
		{
			majors = majors + "\nApplied Mathematics" +
							"\nStatistics" +
							"\nBiomathematics";
		}
		if(sci > 0)
		{
			majors = majors + "\nBiology" +
							"\nChemistry" +
							"\nPhysics" +
							"\nEnvironmental Science" +
							"\nPsychology";
		}
		if(hum > 0)
		{
			majors = majors + "\nJournalism" +
							"\nCriminal Justice" +
							"\nEnglish" +
							"\nHistory" +
							"\nPolitical Science";
		}
		if(bus > 0)
		{
			majors = majors + "\nBusiness Administration" +
							"\nAccounting" +
							"\nEconomics" +
							"\nAdvertising and Marketing";
		}
		if(art > 0)
		{
			majors = majors + "\nAnimation" +
							"\nPhotography" +
							"\nTheatre";
		}
		if(tech > 0)
		{
			majors = majors + "\nComputer Science" +
							"\nGame Design" +
							"\nComputer Programming";
		}
	}
	
	public String toString()
	{
		return "Based on the courses you inputted, please consider the following majors: " + majors;
	}
}