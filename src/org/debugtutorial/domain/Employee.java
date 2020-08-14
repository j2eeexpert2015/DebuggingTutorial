package org.debugtutorial.domain;

public class Employee {
	String name;
	int age;
	int salary;

	public Employee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public double getBonus() {
		double bonus = (salary / age) * 1000;
		return bonus;
	}

}
