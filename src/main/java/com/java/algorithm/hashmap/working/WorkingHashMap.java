package com.java.algorithm.hashmap.working;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class WorkingHashMap {

	public static void main(String[] args) {
//		working1();
//		working2();
//		working3();
		treeMapSorting();
	}

	public static void working1() {
		HashMap<Integer, String> hash_map = new HashMap<>();
		hash_map.put(1, "Red");
		hash_map.put(2, "Green");
		hash_map.put(3, "Black");
		hash_map.put(4, "White");
		hash_map.put(5, "Blue");

		for (Map.Entry<Integer, String> x : hash_map.entrySet()) {
			System.out.println(x.getKey() + " " + x.getValue());
		}

		System.out.println("");

		HashMap<Integer, String> hash_map1 = new HashMap<Integer, String>();
		HashMap<Integer, String> hash_map2 = new HashMap<Integer, String>();

		hash_map1.put(1, "Red");
		hash_map1.put(2, "Green");
		hash_map1.put(3, "Black");
		System.out.println("\nValues in first map: " + hash_map1);

		hash_map2.put(4, "White");
		hash_map2.put(5, "Blue");
		hash_map2.put(6, "Orange");
		System.out.println("\nValues in second map: " + hash_map2);

		hash_map2.putAll(hash_map1);
		System.out.println("\nNow values in second map: " + hash_map2);

		System.out.println("The Original map: " + hash_map);
		HashMap<Integer, String> new_hash_map = new HashMap<Integer, String>();
		new_hash_map = (HashMap) hash_map.clone();
		hash_map.put(6, "Pink");
		new_hash_map.remove(5);
		System.out.println("The Original map: 2 " + hash_map);
		System.out.println("Cloned map: " + new_hash_map);

	}

	public static void working2() {
		HashMap<Integer, String> hash_map = new HashMap<>();
		hash_map.put(1, "Red");
		hash_map.put(2, "Green");
		hash_map.put(3, "Black");
		hash_map.put(4, "White");
		hash_map.put(5, "Blue");

		System.out.println("The Original map: " + hash_map);
		HashMap<Integer, String> new_hash_map = new HashMap<Integer, String>();
		new_hash_map = (HashMap) hash_map.clone();
		hash_map.put(6, "Pink");
		new_hash_map.remove(5);
		System.out.println("The Original map: 2 " + hash_map);
		System.out.println("Cloned map: " + new_hash_map);

//		Set<Entry<Integer, String>> set = hash_map.entrySet();
		Set set = hash_map.entrySet();
		System.out.println("set : " + set);
		boolean cehck = set.contains("1=Red");

		System.out.println("cehck : " + cehck);

		Set keyset = hash_map.keySet();
		System.out.println("Key set values are: " + keyset);

	}

	public static void working3() {
		TreeMap<String, String> tree_map1 = new TreeMap<String, String>();

		// Put elements to the map
		tree_map1.put("C2", "Red");
		tree_map1.put("C1", "Green");
		tree_map1.put("C4", "Black");
		tree_map1.put("C3", "White");

		System.out.println("Orginal TreeMap content: " + tree_map1);
		Set set = tree_map1.descendingKeySet();
		System.out.println("Reverse order view of the keys: " + set);

		NavigableMap<String, String> strMap = tree_map1.descendingMap();
		System.out.println("Reverse order view of the keys: " + strMap);

		System.out.println("");
		TreeMap<Integer, String> tree_map2 = new TreeMap<Integer, String>();
		tree_map2.put(10, "Red");
		tree_map2.put(20, "Green");
		tree_map2.put(40, "Black");
		tree_map2.put(50, "White");
		tree_map2.put(60, "Pink");
		System.out.println("Orginal TreeMap content: " + tree_map1);
		System.out.println("Checking the entry for 10: ");
		System.out.println("Key(s): " + tree_map2.headMap(10));
		System.out.println("Checking the entry for 30: ");
		System.out.println("Key(s): " + tree_map2.headMap(30));
		System.out.println("Checking the entry for 70: ");
		System.out.println("Key(s): " + tree_map2.headMap(70));

		System.out.println("Key(s): " + tree_map2.ceilingKey(40));

	}

	public static void treeMapSorting() {
		TreeMap<Integer, String> tree_map1 = new TreeMap<>(new SortKey());
		// Put elements to the map
		tree_map1.put(2, "Red");
		tree_map1.put(4, "Green");
		tree_map1.put(3, "Black");
		tree_map1.put(1, "White");
		System.out.println("Sorted map > " + tree_map1);
	}
}


class SortKey implements Comparator<Integer> {
	@Override
	public int compare(Integer str1, Integer str2) {
		return str1.compareTo(str2);
	}
}
