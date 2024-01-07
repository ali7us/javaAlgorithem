package com.java.algorithm.list;

import java.util.Objects;

public class Person {

	private String fName;
	private String lName;
	private int salary;
	
	public Person() {}
	public Person(String fName, String lName, int salary) {
		this.fName = fName;
		this.lName = lName;
		this.salary = salary;
	}
	
	
	
	public int hashCode() {
		return Objects.hash(fName);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(fName, other.fName);
	}
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
