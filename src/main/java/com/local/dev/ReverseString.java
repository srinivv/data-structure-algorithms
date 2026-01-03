package com.local.dev;

public class ReverseString {
	public static void main(String[] args) {
		reverse1();
		reverse2();
		
		// String testing... important API to remember
		
		String str = "srini";
		System.out.println(str.codePointAt(1));

		String str1 = "aaaaa";
		System.out.println(str1.toCharArray());

	}

	private static void reverse1() {
		String str = "abcd";
		StringBuilder builder = new StringBuilder();
		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			builder.append(str.charAt(i));
		}
		System.out.println(builder.toString());
	}

	private static void reverse2() {
		String str = "abcd";
		char[] arr = str.toCharArray();
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		System.out.println(arr);
	}
	
	/**
	 * TODO
	 * Use stack to reverse a string
	 */
}
