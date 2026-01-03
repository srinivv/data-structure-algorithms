package com.local.dev.universal.all;

/*
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

	Note: For the purpose of this problem, we define empty string as valid palindrome.

	Example 1:

	Input: "A man, a plan, a canal: Panama"
	Output: true
	Example 2:

	Input: "race a car"
	Output: false
 */
public class $12ValidPalindrome {

	public boolean isPalindrome(String s) {
		StringBuilder builder = new StringBuilder();

		for (char ch : s.toCharArray()) {
			if (Character.isLetterOrDigit(ch)) {
				builder.append(Character.toLowerCase(ch));
			}
		}

		String filteredString = builder.toString();
		String reversedString = builder.reverse().toString();

		return filteredString.equals(reversedString);
	}

	/** An alternate solution using Java 8 Streams */
	public boolean isPalindromeUsingStreams(String s) {
		StringBuilder builder = new StringBuilder();

		s.chars().filter(c -> Character.isLetterOrDigit(c)).mapToObj(c -> Character.toLowerCase((char) c))
				.forEach(builder::append);

		return builder.toString().equals(builder.reverse().toString());
	}
}
