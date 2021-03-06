package demo;

import java.time.LocalDate;

public class General {
	
	public static void getTwoLargestFromArray()
	{
		try
		{
			int[] arr  = {1, 4, 5, 7, 13, 56, 8, 2};
			int largest = Integer.MIN_VALUE;
			int second_largest = Integer.MIN_VALUE;
			
			for (int i = 0; i < arr.length; i++)
			{
				if(i == 0)
				{
					largest = arr[i];
				}
				else if(largest < arr[i])
				{
					second_largest = largest;
					largest = arr[i];
				}
				else if(second_largest < arr[i])
				{
					second_largest = arr[i];
				}
			}
			
			System.out.println("Largest: " + largest);
			System.out.println("Second largest: " + second_largest);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public static void dateDemo()
	{
		LocalDate date = LocalDate.of(1990, 04, 14);
		LocalDate date2 = date.plusYears(28);
		System.out.println(date2);
		
		LocalDate dt = LocalDate.now();
		
	}

}
