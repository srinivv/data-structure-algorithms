package com.local.dev;

public class Palindrome {

	public static boolean isPalindrome(String str) {
	    return str.equals(new StringBuilder(str).reverse().toString());
	}
	
	public static boolean isPalindrome1(String str) {
	    // Convert String to char array
	    char[] charArray = str.toCharArray();  
	    for(int i=0; i < str.length(); i++) {
	        if(charArray[i] != charArray[(str.length()-1) - i]) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public static boolean isPalindrome2(String s) {
		int n = s.length();
		for (int i = 0; i < (n / 2); ++i) {
			if (s.charAt(i) != s.charAt(n - i - 1)) {
				return false;
			}
		}

		return true;
	}
	
	public static boolean palindrome(String s) {
		if (s.length() <= 1)
			return true;
		else
			return (s.charAt(0) == s.charAt(s.length() - 1)) && palindrome(s.substring(1, s.length() - 1));
	}
}
