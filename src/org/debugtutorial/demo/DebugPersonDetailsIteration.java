package org.debugtutorial.demo;

import java.util.List;

import org.debugtutorial.domain.Person;
import org.debugtutorial.util.DataUtil;

public class DebugPersonDetailsIteration {
	public static void main(String[] args) {
		List<Person> personList = DataUtil.getPersonData();
		for (Person p : personList) {
			//some operation
			System.out.println(p);
		}
		
	}

}
