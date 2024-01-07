package com.java.algorithm.generics.sorting;

public class BubbleSortGenerics {

	public static void main(String[] args) {
		Integer[] a = {110,22,58,41,6,20};
		Character[] c = {'c','a','v','g','x','d','t'};
		String[] s = {"Virat","Rohit","Haider","Syed","Ali","Sam","Kalam","Khan","Atif"};
		
		System.out.println("Sorted Integer Array");
		sort_array(a);
		
		System.out.println("Sorted Character Array");
		sort_array(c);
		
		System.out.println("Sorted String Array");
		sort_array(s);
	}
	
	public static <T extends Comparable<T>> void sort_array(T[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if(a[j].compareTo(a[j+1]) > 0)
					swap(j,j+1,a);
			}
		}
		
		for(T f : a) {
			System.out.print(f + ", ");
		}
		System.out.println("");
	}
	
	private static <T> void swap(int i, int j, T[] a) {
		T t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}
