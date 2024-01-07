package com.java.algorithm.array.working;

import java.util.Arrays;

public class ArrayReverse {
	
	public static void main(String[] args) {
		int[] arr = {1,3,5,4,9,6,11};
		System.out.println(Arrays.toString(arr));
		reverse(arr,2,3);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void reverse(int[] numbers, int start, int end) {
	      while (start < end) {
	         int temp = numbers[start];
	         numbers[start] = numbers[end];
	         numbers[end] = temp;
	         start++;
	         end--;
	      }
	   }
}
