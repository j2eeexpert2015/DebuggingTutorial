package org.debugtutorial.demo;

import org.debugtutorial.util.CalculatorUtil;

public class DebugFactorial {
	public static void main(String[] args) {
		int factorial = CalculatorUtil.factorial(5);
		System.out.println("factorial:" + factorial);
	}

}
