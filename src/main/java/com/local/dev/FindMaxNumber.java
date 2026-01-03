package com.local.dev;

import java.util.Arrays;

public class FindMaxNumber { 

	public static void main(String[] args) {
		int[] arr = { 10, 2, 1, 5, 20 };
		FindMaxNumber findMax = new FindMaxNumber();
		System.out.println(findMax.max(arr));
	}
	
	public int max(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	/*
	 * By sorting
	 */
	public static void findMax() {
		int[] arr = { 10, 3, 4, 15, 6};
		Arrays.sort(arr);
		System.out.println("Min: " + arr[0]);
		System.out.println("Max: " + arr[arr.length - 1]);
	}

}
