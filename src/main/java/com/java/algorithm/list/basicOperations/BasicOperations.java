package com.java.algorithm.list.basicOperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.collections.arraylist.customobjects.CustomUser;

public class BasicOperations {

	public static void main(String[] args) {
		List<String> str = DataFeederArrayList.listString();
		List<Integer> intg = DataFeederArrayList.getListInteger();
		List<CustomUser> user = DataFeederArrayList.getCustomUserList();
//		addingIntoList(str, intg, user);
		str = DataFeederArrayList.listString();
//		someAdvancedUses(str);
		
		for(String st : str) {
			System.out.print(st + ", ");
		}
		System.out.println("");
		for (int i = 0; i < str.size(); i++) {
			System.out.println("> " + str.get(i));
			
		}

		addingIntoList(str, intg, user);
	}

	// Adding new elements
	// Adding on specified location
	// remove element
	// remove all elements
	// replace existing
	// sorting
	// shuffle
	public static void addingIntoList(List<String> str, List<Integer> intg, List<CustomUser> user) {
		System.out.println("\n**Old List**");
		str.stream().forEach(e -> System.out.print(e + ", "));
		System.out.println("\n\n** Adding new element Yellow");
		str.add("Yellow"); // adding new
		str.stream().forEach(e -> System.out.print(e + ", "));
		System.out.println("\n\n** Adding at start Pink");
		str.add(0, "Pink"); // adding at specified location
		str.stream().forEach(e -> System.out.print(e + ", "));
		System.out.println("\n\n** Replacing at start Black");
		str.set(0, "Black");
		str.stream().forEach(e -> System.out.print(e + ", "));
		System.out.println("\n\n**Black Remove**");
		str.remove(0);
		str.stream().forEach(e -> System.out.print(e + ", "));
		System.out.println("");
		System.out.println("Check black exists or not: " + str.contains("Black"));

		System.out.println("\n\n**Sorting**");
		Collections.sort(str);
		str.stream().forEach(e -> System.out.print(e + ", "));

		System.out.println("\n\n** Reverse **");
		Collections.reverse(str);
//		Collections.sort(str, Collections.reverseOrder());
		str.stream().forEach(e -> System.out.print(e + ", "));

		System.out.println("\n\n** Suffle**");
		Collections.shuffle(str);
		str.stream().forEach(e -> System.out.print(e + ", "));

		System.out.println("\n\n** After remove element from 0 index**");
		str.remove(0);
		str.stream().forEach(e -> System.out.print(e + ", "));

		System.out.println("\n\n** TrimSize **");
		str.add(""); str.add(""); str.add("");
		System.out.println("str " + str);
		ArrayList<String> srtt = new ArrayList<String>(str);
		srtt.trimToSize();
		System.out.println("srtt : " + srtt);
		
		str.removeAll(str);
		System.out.println("\n\nstr all removed in cloned: " + str);

		System.out.println("Array list after remove all elements " + str);
		System.out.println("Checking the above array list is empty or not! " + str.isEmpty());
		
		System.out.println("\n\n** increase size in srtt**");
		System.out.println("srtt " + srtt);
		srtt.ensureCapacity(10);
		srtt.add("new color");
		System.out.println("srtt " + srtt);
	}

	// compare two array
	// Swap two elements in Array
	// Join two array.
	// copy array
	public static void someAdvancedUses(List<String> str) {
		System.out.println("\n** Compare Two Array List**");
		List<String> str3 = new ArrayList<>();
		str3.add("Black");
		str3.add("White");
		str3.add("Pink");
		str3.add("Green");

//		https://www.w3resource.com/java-exercises/collection/java-collection-exercise-13.php
		ArrayList<String> c3 = new ArrayList<String>();
		for (String e : str3)
			c3.add(str.contains(e) ? "Yes" : "No");
		System.out.println(c3);

		System.out.println("\n\n** Swap Two Element in Array **");
		Collections.swap(str, 0, 2);
		str.stream().forEach(e -> System.out.print(e + ", "));

//		https://www.w3resource.com/java-exercises/collection/java-collection-exercise-15.php
		System.out.println("\n\n** Join two Arrays list into one. **");
		List<String> str2 = new ArrayList<>();
		str2.add("9");
		str2.add("6");
		str2.add("2");
		str2.addAll(str);
		str2.stream().forEach(e -> System.out.print(e + ", "));
		System.out.println("");

		// https://www.w3resource.com/java-exercises/collection/java-collection-exercise-9.php
		System.out.println("\n\n** Copy array : from one to another : but both size must be same **");
		ArrayList<String> List1 = new ArrayList<String>();
		List1.add("1");
		List1.add("2");
		List1.add("3");
		List1.add("4");
		System.out.println("List1: " + List1);
		List<String> List2 = new ArrayList<String>();
		List2.add("A");
		List2.add("B");
		List2.add("C");
		List2.add("D");
		System.out.println("List2: " + List2);
		Collections.copy(List1, List2);
		System.out.println("List1: " + List1);

		// https://www.w3resource.com/java-exercises/collection/java-collection-exercise-16.php
		System.out.println("\nList1 values:  " + List1);
		ArrayList<String> clone = (ArrayList<String>) List1.clone();
		System.out.println("cloned values: " + clone);

	}

}
