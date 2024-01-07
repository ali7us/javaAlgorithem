package com.java.algorithm.generics.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenericMethodWOrking {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(1,3,4,6,8,9,2);
		List<Integer> b = Arrays.asList(6,5,4,7,8,2,1);
		List<Integer> lst1 = mergeTwoListIntoOne(a,b);
		System.out.print(lst1);
	}
	
	public static <T> List<T> mergeTwoListIntoOne(List<T> list1, List<T> list2) {
		Collections.copy(list1, list2);
		return list1;
	}
}
