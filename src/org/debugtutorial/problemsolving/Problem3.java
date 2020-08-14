package org.debugtutorial.problemsolving;

import java.util.List;

import org.debugtutorial.domain.Employee;
import org.debugtutorial.util.DataUtil;

public class Problem3 {
	public static void printCharacters(String word) {
		for (int i = 0; i <= word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	}

	public static void main(String[] args) {
		List<Employee> employeeList = DataUtil.getEmployeeData();
		for (Employee employee : employeeList) {
			System.out.println("Bonus:" + employee.getBonus());
		}

	}
}
