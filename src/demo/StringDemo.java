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
	
	public static void stringBuilderDemo()
	{
		StringBuilder builder = new StringBuilder("hello");
		builder.append(" world");
		builder.append("!");
		System.out.println(builder.toString());
	}
	
	public static void subStringDemo()
	{
		String str = "Sasanga Madhumal";
		String sub = str.substring(8);
		System.out.println(sub);
	}
	
	public static void compareStrings()
	{
		String str1 = "Sasanga";
		String str2 = "SASANGA";
		System.out.println(str1.equalsIgnoreCase(str2));
	}
	
	public static void stringToNumber()
	{
		String str = "2352525";
		int i = Integer.parseInt(str);
	}
	
	public static void stringOperations()
	{
		String str = "Sasanga";
		boolean isStart = str.startsWith("s");
		boolean isEnd = str.endsWith("g");
		boolean isContain = str.contains("t");
	}
	
	
}
