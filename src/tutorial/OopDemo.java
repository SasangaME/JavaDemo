package tutorial;

import java.util.Random;

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
	
	public static void countObjectDemo()
	{
		Item a = new Item();
		Item b = new Item();
		Item c = new Item();
		Item d = new Item();
		System.out.println(d.getObjectCount());
	}
	
	
	public static void showDemo()
	{
		show("Hello");
	}
	
	public static void show(int i)
	{
		System.out.println(i);
	}
	
	public static void show(String str)
	{
		System.out.println(str);
	}
	
	public static void annonymouseDemo()
	{
		A objA = new A();
		var v = new A().show("");
	}
	
	public static void abstractionDemo()
	{
		
	}
}

class Item
{
	static int counter = 0;
	
	public Item()
	{
		counter++;
	}
	
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
	
	public int getObjectCount()
	{
		return counter;
	}
	
}

class Parent
{
	protected int a;
	protected int b;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public double add()
	{
		return a + b;
	}
	
	public  void sell()
	{
		System.out.println("method in super class");
	}
	
	public void show()
	{
		System.out.println("Hello world");
	}
}

class Child extends Parent
{
	public Child()
	{
		super();
	}
	
	public double subtract()
	{
		return a - b;
	}
	
	public void shoppingCartAdd()
	{
		if(getA() > 5)
		{
			super.sell();
		}
	}
	

	public void show() // method overriding
	{
		int a = new Random().nextInt();
		System.out.println(a);
	}
	
}

class NextChild extends Child
{
	 public double mul()
	 {
		 return a * b;
	 }
}

interface iEmployee
{
	final int MAX_VAL = 234;
	public double getAnnualSalary();
	public double getBonus(double percentage);
}

class Employee implements iEmployee
{

	@Override
	public double getAnnualSalary() {
		// TODO Auto-generated method stub
		return MAX_VAL;
	}

	@Override
	public double getBonus(double percentage) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}

class A{
	private int x;
	
	public A()
	{
		
	}
	
	public A(int x)
	{
		this.x = x;
	}
	
	public void show()
	{
		System.out.println("x is " + x);
	}
	
	public int show(String str)
	{
		return 1;
	}
}

