package com.java.algorithm.sorting;

import java.util.Arrays;

public class BubbleSort {

//	https://www.w3resource.com/java-exercises/sorting/java-sorting-algorithm-exercise-2.php
	
	public static void main(String[] args) {
		int nums[] = {7, -5, 3, 2, 1, 0, 45};
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(nums));
        bubbleSort(nums);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(nums));
	}
	
	public static void bubbleSort(int nums[]) {
		int n = nums.length;
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n-i-1; j++ ) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
	}
}
