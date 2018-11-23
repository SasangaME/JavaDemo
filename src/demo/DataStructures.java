package demo;

import java.util.*;

public class DataStructures {
	
	public static void arrayListDemo()
	{
		ArrayList<Object> lst = new ArrayList<Object>();
		lst.add(245);
		lst.add("fucker");
		lst.add(true);
		lst.add('c');
		
		for(Object item: lst)  //foreach loop
		{
			System.out.println(item);
		}
		
		lst.remove("fucker");
		lst.remove(true);
		
		lst.get(1); // get element of index 1
		lst.set(1, "Hello"); //replaces element with another
		
	}
	
	public static void listDemo()
	{
		List<Character> lst = new ArrayList<Character>(); 
		for(int i = 70; i < 111; i++)
		{
			char ch = (char) i;
			lst.add(ch);
		}
		
		for(char ch: lst)
		{
			System.out.println(ch);
		}
		
		Collections.sort(lst);
		
	}
	
	public static void multiArray()
	{
		int[][] arr = {{1,2,3}, {2,3,4}, {3, 4, 5}};
		
		for(int[] i: arr)
		{
			for(int j: i)
			{
				System.out.print(" " + j);
			}
			System.out.println();
		}
	}
	
	public static void variableArguments()
	{
		System.out.println(getAverage(1, 2, 3));
	}
	
	public static double getAverage(double... values)
	{
		int sum = 0;
		for(double d : values)
		{
			sum += d;
		}
		return sum / values.length;
	}

}
