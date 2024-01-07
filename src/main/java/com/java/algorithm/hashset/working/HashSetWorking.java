package com.java.algorithm.hashset.working;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetWorking {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("White");
		hashSet.add("Blue");
		hashSet.add("Black");
		hashSet.add("Pink");
		hashSet.add("Black");
		hashSet.add("Blue");
		System.out.println(hashSet);
		String[] arr = convertHashSetToArray(hashSet);
		System.out.println(Arrays.toString(arr));

		System.out.println("\nPrinting TreeSet");
		System.out.println(convertToTreeSet(hashSet));

		System.out.println("\nPrinting ArrayList");
		System.out.println(intoArrayList(hashSet));

		compareTwoHashSet();
		
		System.out.println(" ");
		compareTwoHashSetStoreMatching();
	}

	public static String[] convertHashSetToArray(HashSet<String> str) {
		String[] newArray = new String[str.size()];
		str.toArray(newArray);
		return newArray;
	}

	public static TreeSet<String> convertToTreeSet(HashSet<String> str) {
		return new TreeSet<String>(str);
	}

	public static ArrayList<String> intoArrayList(HashSet<String> str) {
		return new ArrayList<String>(str);
	}

	// https://www.w3resource.com/java-exercises/collection/java-collection-hash-set-exercise-10.php
	public static void compareTwoHashSet() {
		HashSet<String> h_set = new HashSet<>();
		h_set.add("Red");
		h_set.add("Green");
		h_set.add("Black");
		h_set.add("White");

		HashSet<String> h_set2 = new HashSet<>();
		h_set2.add("Red");
		h_set2.add("Pink");
		h_set2.add("Black");
		h_set2.add("Orange");

		HashSet<String> result_set = new HashSet<>();
		for (String element : h_set) {
			System.out.println(h_set2.contains(element) ? "Yes" : "No");
		}
	}

	// https://www.w3resource.com/java-exercises/collection/java-collection-hash-set-exercise-11.php
	public static void compareTwoHashSetStoreMatching() {
		HashSet<String> h_set1 = new HashSet<String>();
		h_set1.add("Red");
		h_set1.add("Green");
		h_set1.add("Black");
		h_set1.add("White");
		System.out.println("Frist HashSet content: " + h_set1);
		
		HashSet<String> h_set2 = new HashSet<String>();
		h_set2.add("Red");
		h_set2.add("Pink");
		h_set2.add("Black");
		h_set2.add("Orange");
		System.out.println("Second HashSet content: " + h_set2);
		
		h_set1.retainAll(h_set2);
		System.out.println("HashSet content:");
		System.out.println(h_set1);
	}
}
