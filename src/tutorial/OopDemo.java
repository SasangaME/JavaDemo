package tutorial;

public class OopDemo {

	public static void variableArgDemo()
	{
		System.out.println(variableArgs(2, 3, 5, 8, 13, 21, 34));
	}
	
	public static double variableArgs(int ... values) // variable number of arguments
	{
		double d = 1;
		for(int i : values)
		{
			d *= i;
		}
		return d;
	}
	
	public static void refandvalue()
	{
		int i = 10;
		int j = i;
		i++;
		System.out.println(j);
		System.out.println(i);
	}
	
	public static void refAndValObjDemo()
	{
		Item itemA = new Item();
		itemA.setItemName("Item A");
		Item itemB = itemA;
		System.out.println(itemB.getItemName());
		itemA.setItemName("Item A modified");
		System.out.println(itemB.getItemName());
	}
}

class Item
{
	private String itemName;
	static int i = 5;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public static int show()
	{
		return i; // only a static variable can be used in a static method
	}
	
}
