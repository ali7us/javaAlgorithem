package com.java.algorithm.array.working;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumArray {

	public static void main(String[] args) {
		int[] arr = {1,3,5,4,9,6,11};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(twoSum(arr, 9)));
	}
	
	public static int[] twoSum(int[] numbers, int target) {
	      int[] result = new int[2];
	      Map<Integer, Integer> map = new HashMap<>();

	      for (int i = 0; i < numbers.length; i++) {
	         if (!map.containsKey(target - numbers[i])) {
	            map.put(numbers[i], i);
	         } else {
	            result[1] = i;
	            result[0] = map.get(target - numbers[i]);
	            return result;
	         }
	      }
	      throw new IllegalArgumentException("Two numbers not found");
	   }
}
