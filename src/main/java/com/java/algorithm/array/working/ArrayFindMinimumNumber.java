package com.java.algorithm.array.working;

public class ArrayFindMinimumNumber {

	public static void main(String[] args) {
		
	}
	
	public int findMinimum(int[] arr) {
	      // edge case
	      if (arr == null || arr.length == 0) {
	         throw new IllegalArgumentException("Invalid input");
	      }

	      int min = arr[0]; // min will hold the minimum of array
	      for (int i = 1; i < arr.length; i++) {
	         if (arr[i] < min) {
	            min = arr[i];
	         }
	      }
	      return min;
	   }
}
