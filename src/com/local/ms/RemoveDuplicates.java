package com.local.ms;

import java.util.LinkedHashSet;

// Removes duplicate characters from the string

public class RemoveDuplicates {
	
	void removeDuplicates(String str) {
		LinkedHashSet<Character> lhs = new LinkedHashSet<>();
		for (int i = 0; i < str.length(); i++)
			lhs.add(str.charAt(i));

		for (Character ch : lhs)
			System.out.print(ch);
	}

	public static void main(String args[]) {
		String str = "srinivasanvelusamy";
		RemoveDuplicates r = new RemoveDuplicates();
		r.removeDuplicates(str);
	}
}
