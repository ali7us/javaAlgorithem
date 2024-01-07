package com.collections.arraylist.customobjects;

import java.time.LocalDate;
import java.util.Objects;

public class CustomUser implements Comparable<CustomUser>{

	private long id;
	private String name;
	private int salary;
	private String dept;
	private LocalDate dob;
	
	
	public CustomUser(long id, String name, int salary, String dept, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.dob = dob;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomUser other = (CustomUser) obj;
		return Objects.equals(name, other.name) && salary == other.salary;
	}

	@Override
	public int compareTo(CustomUser c) {
		int a = name.compareTo(c.name);
		if(a == 0) {
			return 0;
		} else if (a > 0) {
			return 1;
		} else {
			return -1;
		}
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
	
}
