package com.java.algorithm.generics.sorting;

public class Working {

	public static void main(String[] args) {
		Integer[] i = {5,3,6,4,2,8,1,9,5};
		Character[] c = {'j','b','h','w','e','p','a','c','d'};
		String[] s = {"Ali","Akhir","Baker","Khan","Atif","Lalo","Haider","Syed"};
		sort_array(i);
		sort_array(c);
		sort_array(s);
	}
	
	public static <T extends Comparable<T>> void sort_array(T[] a) {
		for(int i = 0; i<a.length - 1; i++) {
			for(int j=0; j<a.length - i - 1; j++) {
				if(a[j].compareTo(a[j+1]) > 0)
					swap(j,j+1,a);
			}
		}
		for(T s : a) {
			System.out.print(s + ", ");
		}
		System.out.println("");
	}
	
	private static <T> void swap(int i, int j, T[] a) {
		T t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}
