package org.debugtutorial.util;

public class CalculatorUtil {
	public static int add(int num1,int num2)
	{
		int sum = num1+num2;
		System.out.println("num1:"+num1+",num2:"+num2+",sum:"+sum);
		return sum;
	}
	
	public static int subtract(int num1,int num2)
	{
		return (num1-num2);
	}
	
	public static int multiply(int num1,int num2)
	{
		return (num1*num2);
	}
	
	public static int divide(int num1,int num2)
	{
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		int result = num1/num2;
		return result;
	}
	
	public static int square(int num1)
	{
		return multiply(num1, num1);
	}
	
	public static int factorial(int n) {
		int result = 1;                                                                                                                        
		if (n > 1) 
		{
			result = (n * factorial(n - 1));
		}
		return result;
	}

}
