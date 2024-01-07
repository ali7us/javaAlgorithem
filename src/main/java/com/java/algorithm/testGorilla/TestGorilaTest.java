package com.java.algorithm.testGorilla;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TestGorilaTest {
	
	public static void main(String[] args) {
		String input = "t1est1t, Hello1e, Pak21df";
		String str = decryption(input);
		System.out.println(str);
	}
	public static String decryption(String input) {
		// Insert your code here
		Map<String, Integer> maps = new TreeMap<>();
		String[] strArr = input.split(",");

		for (int i = 0; i < strArr.length; i++) {

			String keyName = "";
			for (Character chr : strArr[i].trim().toCharArray()) {
				// first making keys e.g. test and hello etc.
				if (!chr.isDigit(chr)) {
					keyName += chr;
				}
			}

			// working for key's values to sum them up agains respective keys.
			for (Character chr : strArr[i].toCharArray()) {
				if (chr.isDigit(chr)) {
					if (maps.containsKey(keyName)) {
						maps.put(keyName, maps.get(keyName) + chr.getNumericValue(chr) );
					} else {
						maps.put(keyName, chr.getNumericValue(chr));
					}
				} /*else {
					maps.put(keyName, 0);
				}*/
			}
		}

		// getting the final decypted password based on number assending values.
		String password = "";
		for (Entry<String, Integer> entry : maps.entrySet()) {
				password += entry.getKey()+ " ";
		}
		return password;

	}

	
	// how to sort map
	// if insertion sort on values then which map type should use as TreeMap is sorted on key by default.
	// 
}
