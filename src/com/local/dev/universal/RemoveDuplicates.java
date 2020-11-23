package com.local.dev.universal;

import java.util.Arrays;
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
	
	/*
	 * Another approach
	 */
	public static String removeDuplicate(char str[], int n) {
		// Used as index in the modified string
		int index = 0;

		// Traverse through all characters
		for (int i = 0; i < n; i++) {

			// Check if str[i] is present before it
			int j;
			for (j = 0; j < i; j++) {
				if (str[i] == str[j]) {
					break;
				}
			}

			// If not present, then add it to
			// result.
			if (j == i) {
				str[index++] = str[i];
			}
		}
		return String.valueOf(Arrays.copyOf(str, index));
	}
}
