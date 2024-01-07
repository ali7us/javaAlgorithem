package com.java.algorithm.array.working;

import java.util.HashMap;
import java.util.Map;

public class FindAndCount_NisumTest {

	// identify the counter of number in array.
	public static void main(String[] args) {
		int[] arr = {1,1,1,2,3,2,1,2,3,4,5,6,5};
		Map<Integer, Integer> result = testing(arr);
		System.out.println(result);
	}
	
	public static Map<Integer, Integer> testing(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();	
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			} else {
				map.put(arr[i], 1);
			}
		}
		return map;
	}
}
