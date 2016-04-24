package com.local.dev;

import java.util.Arrays;

public class FindMaxNumberBySort {

	public static void main(String[] args) {
		findMax();
	}
	
	public static void findMax() {
		int[] arr = { 10, 3, 4, 15, 6};
		Arrays.sort(arr);
		System.out.println("Min: " + arr[0]);
		System.out.println("Max: " + arr[arr.length - 1]);
	}
}
