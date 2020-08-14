package org.debugtutorial.demo;

import org.debugtutorial.util.DataUtil;

public class DebugPersonDetails {
	public static void main(String[] args) {
		int firstPersonAge = DataUtil.getPersonData().get(0).getAge();
		
		System.out.println("Line number 1 for debug !!");
		System.out.println("Line number 2 for debug !!");
		System.out.println("Line number 3 for debug !!,firstPersonAge:"+firstPersonAge);
		System.out.println("Line number 4 for debug !!");
	}
	
}
