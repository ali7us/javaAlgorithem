package com.java.algorithm.sorting;

import java.util.Arrays;

public class QuickSort {
	
	private static int[] temp_num;
	
	public static void main(String[] args) {
		int[] arr1 = {51,95,66,72,42,38,39,41,15};
		System.out.println("Before Sort " + Arrays.toString(arr1));
		sort(arr1);
		System.out.println("After  Sort " + Arrays.toString(arr1));
	}
	
	public static void sort(int[] nums) {
		if(nums == null || nums.length ==0) 
			return;
		
		temp_num = nums;
		int len = nums.length;
		quickSort(0, len - 1);
	}

	private static void quickSort(int low, int high) {
		int i = low;
		int j = high;
		
		int pivot = temp_num[low + (high-low)/2];
		
		while(i <= j) {
			while(temp_num[i] < pivot) {
				i++;
			}
			while(temp_num[j] > pivot) {
				j--;
			}
			if(i <= j) {
				swap(i,j);
				i++;
				j--;
			}
		}
		if(low < j) {
			quickSort(low, j);
		}
		if(i < high) {
			quickSort(i, high);
		}
	}
	
	private static void swap(int i, int j) {
		int temp = temp_num[i];
		temp_num[i] = temp_num[j];
		temp_num[j] = temp;
	}

}
