package com.java.algorithm.otherProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighest {

	// Finding-the-2nd-highest-number-in-an-array
	public static void main(String[] args) {
		Integer[] arr = { 2, 4, 6, 3, 6, 5 };
		getHighest(arr);
//		System.out.println(get2ndHigh(arr));

//		System.out.println(java8Way(arr));
//		method1();
	}

	public static void method1(Integer[] arr) 
	{
		List<Integer> numbers = Arrays.asList(arr);
		List<Integer> sortedUniqueNumbers = numbers.stream()
				.distinct() // remove duplicates
				.sorted() // sort
				.collect(Collectors.toList()); // convert stream to list
		System.out.println("sec_highest=" + sortedUniqueNumbers.get(sortedUniqueNumbers.size() - 2));
	}

	public static int java8Way(Integer[] arr) 
	{
		List<Integer> lst2 = Arrays.asList(arr).stream().distinct().sorted().collect(Collectors.toList());
		return lst2.get(lst2.size()-2);
	}

	public static int get2ndHigh(Integer[] arr) 
	{
		int h1_st = 0;
		int h2_nd = 0;

		for (int hs : arr) {
			if (hs > h1_st) {
				h2_nd = h1_st;
				h1_st = hs;
			}
			if (hs > h2_nd && hs != h1_st)
				h2_nd = hs;
		}

		return h2_nd;
	}

	public static void getHighest(Integer[] arr) 
	{
		int high = 0;
		int high2nd = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > high) {
				high2nd = high;
				high = arr[i];
			}
			if (arr[i] > high2nd && arr[i] != high) {
				high2nd = arr[i];
			}
		}
		System.out.println("hight: " + high + " 2nd High: " + high2nd);
	}
}
