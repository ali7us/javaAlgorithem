package com.java.algorithm.array.working;

public class ArrayFindMissingNumber {

	public static int findMissingNumber(int[] arr) {
	      int n = arr.length + 1;
	      int sum = n * (n + 1) / 2;
	      for (int num : arr) {
	         sum = sum - num;
	      }
	      return sum;
	   }

	   public void arrayDemo() {
	      int[] arr = { 1, 3, 6, 8, 2, 4, 7, 5, 10 };
	      System.out.println(findMissingNumber(arr));
	   }

	   public static void main(String[] args) {
		   ArrayFindMissingNumber arrUtil = new ArrayFindMissingNumber();
	      arrUtil.arrayDemo();
	   }
	   
}
