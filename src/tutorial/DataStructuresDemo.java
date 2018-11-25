package tutorial;

import java.util.Random;

public class DataStructuresDemo {
	
	public static void arrayDemo()
	{
		Random r = new Random();
		int[] arr = new int[10];
		
		for(int j = 0; j < 10; j++)
		{
			arr[j] = r.nextInt();
		}
		
		for(int i: arr)
		{
			System.out.println(i);
		}
	}
	
	public static void twodArray()
	{
		int[][] arr = new int[5][5];
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				arr[i][j] = new Random().nextInt();
			}
		}
		
		for(int[] k : arr)
		{
			for(int l : k)
			{
				System.out.print(l + " ");
			}
			System.out.println();
		}
	}
	

}
