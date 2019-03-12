public class InventoryItems
{
	private String manufacturer, name, category;
	private int upc;
	private double price;
	
	public InventoryItems(String manufacturer, String name)
	{
		this.manufacturer = manufacturer;
		this.name = name;
		this.upc = (int)(Math.random() * 1000000000) + 1;
		this.category = null;
		this.price = 0;
	}
	
	public InventoryItems(String manufacurer, String name, String category, double price)
	{
		this.manufacturer = manufacturer;
		this.name = name;
		this.upc = (int)(Math.random() * 1000000000) + 1;
		this.category = category;
		this.price = price;		
	}
	
	public void printString()
	{
		System.out.println("Product Info...\nManufacturer: " + manufacturer +
							   "\nName: " + name +
							   "\nCategory: " + category +
							   "\nprice: $" + price +
							   "\nupc: " + upc);
	}
}