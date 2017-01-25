public class InventoryItems
{
	private String manufacturer;
	private String name;
	private String category;
	private int UPC;
	private double price;
	
	public InventoryItems()
	{
		manufacturer = "";
		name = "";
		category = "";
		UPC = 0;
		price = 0;
	}
	
	public InventoryItems(String m, String n)
	{
		manufacturer = m;
		name = n;
		category = "unknown";
		UPC = (int)(Math.random() * 1000000000) + 1;
		price = 0;
	}
	
	public InventoryItems(String m, String n, String c, double p)
	{
		manufacturer = m;
		name = n;
		category = c;
		UPC = (int)(Math.random() * 1000000000) + 1;
		price = p;
	} 
	
	public String toString()
	{
		return "This item: \nManufacturer: "+manufacturer +
				"\nName: " + name+
				"\nCategory: "+category+
				"\nUPC: " + UPC+
				"\nprice: " + price;
	}
	
}