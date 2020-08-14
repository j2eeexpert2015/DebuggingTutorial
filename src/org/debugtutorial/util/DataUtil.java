package org.debugtutorial.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.debugtutorial.domain.Employee;
import org.debugtutorial.domain.Person;

public class DataUtil {
	public static List getPersonListWithOtherDatatypes() {
		Person p1 = new Person("Steve", 40, "US");
		Person p2 = new Person("Martin", 50, "Germany");
		Person p3 = new Person("Marco", 20, "Netherlands");

		List personList = new ArrayList();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add("Dummy Data");
		personList.add(new Integer(1));
		return personList;
	}

	public static List<Person> getPersonData() {
		System.out.println("getPersonData()... start");
		Person steve = new Person("Steve", 40, "US");
		Person personWithNullCountry = new Person(
				"Person With Null Country !!", 20, null);
		Person martin = new Person("Martin", 50, "Germany");
		Person personWithNullName = new Person(null, 40, "England");
		Person personWithNullName2 = new Person(null, 40, "England");
		Person personWithNullName3 = new Person(null, 40, "England");
		Person marco = new Person("Marco", 20, "Netherlands");
		Person personWithZeroAge = new Person("Marco", 0, "Netherlands");

		List<Person> personList = new ArrayList<>();
		personList.add(steve);
		personList.add(personWithNullCountry);
		personList.add(martin);
		personList.add(personWithNullName);
		personList.add(personWithNullName2);
		personList.add(personWithNullName3);
		personList.add(marco);
		personList.add(personWithZeroAge);
		System.out.println("getPersonData()... end before return");
		return personList;
	}

	public static Map<Integer, Person> getPersonMap() {
		Person steve = new Person("Steve", 40, "US");
		Person martin = new Person("Martin", 50, "Germany");
		Map<Integer, Person> personMap = new HashMap<>();
		personMap.put(1, steve);
		personMap.put(2, martin);
		return personMap;
	}

	public static List<Employee> getEmployeeData() {
		Employee employee1 = new Employee("Peter", 27, 1000);
		Employee employee2 = new Employee("David", 45, 2500);
		Employee employee3 = new Employee("Kevin", 0, 3500);
		Employee employee4 = new Employee("Mark", 42, 2000);

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		return employeeList;
	}
}
