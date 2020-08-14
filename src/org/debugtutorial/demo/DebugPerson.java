package org.debugtutorial.demo;

import java.util.List;
import java.util.Map;

import org.debugtutorial.domain.Person;
import org.debugtutorial.util.DataUtil;

public class DebugPerson {
	public static void main(String[] args) {
		List<Person> personList = DataUtil.getPersonData();
		System.out.println("personList:" + personList);
		Map<Integer, Person> personMap = DataUtil.getPersonMap();
		System.out.println("personMap:" + personMap);
		Person firstPerson = personList.get(0);
		System.out.println("name:"+firstPerson.getName()+",age:"+firstPerson.getAge());
	}

}
