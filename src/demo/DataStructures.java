package demo;

import java.util.*;

public class DataStructures {
	
	public static void arrayListDemo()
	{
		ArrayList lst = new ArrayList();
		lst.add(245);
		lst.add("fucker");
		lst.add(true);
		lst.add('c');
		
		for(Object item: lst)  //foreach loop
		{
			System.out.println(item);
		}
		
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
		
	}

}
