package demo;

import java.math.BigInteger;

public class Numbers {
	
	public static double getPower(int d, int e)
	{
		double result = 1;
		
		for(int i = 0; i < e; i++)
		{
			result *= d;
		}
		
		return result;
	}
	
	public static void bigIntegerDemo()
	{
		BigInteger n = new BigInteger("0384503805830584038503805830538030850380539347949264892649824929472948");
		BigInteger m = new BigInteger("2322525252203805830538030850380539347949264892649824929472948");
		BigInteger p = n.add(m);
		System.out.println(p);
	}

}
