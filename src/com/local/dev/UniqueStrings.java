package com.local.dev;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueStrings {

	public static void main(String[] args) {
		String[] array1 = {"abc", "123", "xyz", "222" };
		String[] array2 = {"xyz", "abc", "100", "123", "111"};
		
		Set<String> set = unique(array1, array2);
		for (String string : set) {
			System.out.println(string);
		}
	}
	public static Set<String> unique(String[] array1, String[] array2) {
		Set<String> set = new HashSet<String>();
		set.addAll(Arrays.asList(array1));
		set.addAll(Arrays.asList(array2));
		return set;
	}
}
