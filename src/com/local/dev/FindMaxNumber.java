package com.local.dev;

public class FindMaxNumber {

	public static void main(String[] args) {
		int[] arr = { 10, 2, 1, 5, 20 };
		FindMaxNumber findMax = new FindMaxNumber();
		System.out.println(findMax.max(arr));
	}
	
	public int max(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			while (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
