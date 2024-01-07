package com.java.algorithm.testGorilla;

public class TestGorilaWorking {

	
	// 1- remove numberic values
	// 2- cancatenate string to create sentence.
	// 3- capital the first characters
	public static void main(String[] args) {
		String[] strArr = {"break3ing news:", "1A 1circle is round!"}; // result >> Breaking News: A Circle Is Round!
		System.out.println(getTitle2(strArr));
	}
	
	private static String getTitle2(String[] arr) 
	{	
		StringBuilder title = new StringBuilder();
		for(String s: arr) {
			
			String[] arr2 = s.split(" ");
			for(String ss : arr2) {
				
				StringBuilder bld = new StringBuilder();
				for(Character chr : ss.toCharArray()) {
					if(!chr.isDigit(chr)) {
						bld.append(chr);
					}
				}
				title.append(bld.toString().substring(0, 1).toUpperCase().concat(bld.toString().substring(1))+" ");
			}
		}
		return title.toString();
	}
}
