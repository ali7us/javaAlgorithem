package com.java.algorithm.string.working;

public class StringEqualityCheck {

	public static void main(String[] args) {
		var s1 = "Java";
		var s2 = "Java";
		var s3 = "Ja".concat("va");
		var s4 = s3.intern();
		var sb1 = new StringBuilder();
		sb1.append("Ja").append("va");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(sb1.toString() == s1);
		System.out.println(sb1.toString().equals(s1));
		
//		System.out.println("1 > "+ s1 == s2);
//		System.out.println("2 > "+ s1.equals(s2));
//		System.out.println("3 > "+ s1 == s3);
//		System.out.println("4 > "+ s1 == s4);
//		System.out.println("5 > "+ sb1.toString() == s1);
//		System.out.println("6 > "+ sb1.toString().equals(s1));
		/*
		 	false
			2 > true
			false
			false
			false
			6 > true
		 */
	}
}
