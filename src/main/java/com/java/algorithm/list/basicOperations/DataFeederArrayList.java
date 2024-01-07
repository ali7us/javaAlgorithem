package com.java.algorithm.list.basicOperations;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.collections.arraylist.customobjects.CustomUser;

public class DataFeederArrayList {

	public static List<String> listString() {
		ArrayList<String> str = new ArrayList<>();
		str.add("Red");
		str.add("Green");
		str.add("Blue");
		return str;
	}
	
	public static List<Integer> getListInteger() {
		ArrayList<Integer> intg = new ArrayList<>();
		intg.add(1);
		intg.add(2);
		intg.add(3);
		return intg;
	}
	
	
	public static List<CustomUser> getCustomUserList() {
		ArrayList<CustomUser> user = new ArrayList<>();
		user.add(new CustomUser(1, "Haider", 50000, "IT", LocalDate.of(2001,01,01)));
		user.add(new CustomUser(1, "Syed", 40000, "Marketing", LocalDate.of(2003,8,05)));
		user.add(new CustomUser(1, "Atif", 60000, "Inventory", LocalDate.of(2005,9,01)));
		user.add(new CustomUser(1, "Khan", 45000, "IT", LocalDate.of(2007,11,05)));
		user.add(new CustomUser(1, "Hina", 70000, "Marketing", LocalDate.of(2002,10,10)));
		return user;
	}
}
