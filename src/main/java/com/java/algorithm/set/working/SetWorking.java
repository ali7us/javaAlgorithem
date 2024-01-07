package com.java.algorithm.set.working;

import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class SetWorking {

	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<>();
		setA.addAll(Arrays.asList(new Integer[] {1,3,4,5,6,8,2,10}));
		
		Set<Integer> setB = new HashSet<>();
		setB.addAll(Arrays.asList(new Integer[] {5,3,6,7,4,8,6,5,9}));
		
		// to find the union
		setA.addAll(setB);
		System.out.println("Union: " + setA);
		
		// to find intersection
		Set<Integer> intersection = new HashSet<>(setA);
		intersection.retainAll(setB);
		System.out.println("Intersection: " + intersection);
		
		// to find difference
		Set<Integer> difference = new HashSet<>(setA);
		difference.removeAll(setB);
		System.out.println("difference: " + difference);
	}
}
