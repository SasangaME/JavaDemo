package demo;

public class StringDemo {

	public static void stringFirst()
	{
		try
		{
			String str = "Sasanga";
			System.out.println(str.length());
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
