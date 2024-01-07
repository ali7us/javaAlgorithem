package com.java.algorithm.sorting;

import java.util.Arrays;

public class RadixSort {

	public static void main(String[] args) {
        int nums[] = {7, -5, 3, 2, 1, 0, 45};
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(nums));
        sort(nums);
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(nums));
	}
	
	public static void sort(int[] array) {
		radixSort(array, 10);
	}
	
	private static void radixSort(int[] array, int radix) {
		if(array.length == 0) return;
		
		int minValue = array[0];
		int maxValue = array[0];
		
		for(int i = 1; i < array.length; i++ ) {
			if(array[i] < minValue) {
				minValue= array[i];
			} else if(array[i] > maxValue) {
				maxValue = array[i];
			}
		}
		System.out.println(minValue);
		System.out.println(maxValue);
	}
	
	
}
