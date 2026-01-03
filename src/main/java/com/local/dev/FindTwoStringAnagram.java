package com.local.dev;

import java.util.Arrays;

public class FindTwoStringAnagram {

	public boolean isAnagram(String firstWord, String secondWord) {
	     char[] word1 = firstWord.replaceAll("[\\s]", "").toLowerCase().toCharArray();
	     char[] word2 = secondWord.replaceAll("[\\s]", "").toLowerCase().toCharArray();
	     Arrays.sort(word1);
	     Arrays.sort(word2);
	     return Arrays.equals(word1, word2);
	}
}
