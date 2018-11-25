package tutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Basics {
	
	public static void basicsDemo()
	{
		int a = 5;
		int b = 4;
		int c = a + b;
		System.out.printf("%d + %d = %d", a, b, c); // print format
		System.out.println();
		
		// binary to decimal
		int i = 0B101;
		System.out.printf("%d", i);
		System.out.println();
		
		// can use underscore for the readability
		long j = 100_000_000_000_000_000L;
		
		String str = (a >= 5) ? ">5" : "<5"; // ternary operator
		String switchStr = "sdfs";
		
		//switch statement
		switch(a) {
		case 1:
			switchStr = "1";
			break;
		case 2:
			switchStr = "2";
			break;
		case 5:
			switchStr = "5";
			break;
		default:
			switchStr = "0 or null";
			break;
				
		}
		
		
		System.out.println(switchStr);
				
		
//		while loop
		int count = 0;
		int sum = 0;
		while(count < 11)
		{
			sum += count;
			count++;
		}
		
				
	}
	
	public static void breakDemo()
	{
		outer: //outer loop label
		for(int j = 0; j <= 10; j++)
		{
			for(int k = 0; k <= 10; k++)
			{
				double d = Math.random();
				System.out.println(j + " - " + k + " : " + d);
				if(d > 0.975)
					break outer; // breaking the outer loop
				else if(d > 0.95)
					break;
			}
			System.out.println();
		}
	}
	
	public static void pallindrome()
	{
		String str = "pip";
		Stack<Character> st = new Stack<Character>();
		for(char ch : str.toCharArray())
		{
			st.push(ch);
		}
		String rvs = "";
		while(!st.isEmpty())
		{
			rvs += st.pop();
		}
		System.out.println(str.equals(rvs));
	}
	
	public static void pattern()
	{
		for(int i = 1; i <= 9; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	public static void perfectNum()
	{
		Scanner sc = new Scanner(System.in);
		char ch = 'y';
		while(ch == 'y')
		{
			System.out.print("Enter number : ");
			int num = sc.nextInt();
			System.out.println(isPerfect(num));
			System.out.print("Continue? (y/n); ");
		    ch = sc.next().charAt(0);
		}
		sc.close();
	}
	
	public static boolean isPerfect(int num)
	{
		boolean isValid = false;
		
		List<Integer> lst = new ArrayList<Integer>();
		
		for(int i = 1; i < num; i++)
		{
			if(num % i == 0)
			{
				lst.add(i);
			}
		}
		
		int sum = 0;
		for(int item : lst)
		{
			sum += item;
		}
		
		if(sum == num)
			isValid = true;
		
		return isValid;
	}
	
	public static void primeNumbers()
	{
		ArrayList<Integer> lst = new ArrayList<Integer>();
		
		for(int i = 2; i <= 100; i++)
		{
			boolean isPrime = true;
			for(int j = 2; j < i; j++)
			{
				if(i % j == 0)
				{
					isPrime = false;
					break;
				}
					
			}
			if(isPrime)
				lst.add(i);
		}
		
		for(int item : lst)
		{
			System.out.println(item);
		}
	}
	

}
