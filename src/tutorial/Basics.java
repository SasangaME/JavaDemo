package tutorial;

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

}
