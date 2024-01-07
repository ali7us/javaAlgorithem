package com.java.algorithm.array.working;

import java.util.HashMap;
import java.util.Map;

public class FindAndCountChar {

	public static void main(String[] args) {
		String s = "aadddjjjllkk";
		int N = 12;
		Map<String, Integer> result = method1(N, s);
		System.out.println(result);
	}
	
	public static Map<String, Integer> method1(int N, String s) 
	{
		String[] charSet = s.split("");
		Map<String, Integer> counterMap = new HashMap<>();
		for(int i=0; i< N; i++) {
			if(!counterMap.containsKey(charSet[i])) {
				counterMap.put(charSet[i], 1);
			} else {
				counterMap.put(charSet[i], counterMap.get(charSet[i]) + 1 );
			}
		}
//		System.err.println();
//		for(Entry<String, Integer> entry : counterMap.entrySet()) {
//			System.out.print(entry.getKey() + ":" + entry.getValue() + " ");
//		}
		return counterMap;
	}	
}
