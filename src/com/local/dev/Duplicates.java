package com.local.dev;

public class Duplicates {
	public static int[] removeDuplicates(int[] arr) {
		int[] tempArr = new int[arr.length];

		int count = 0;
		for (int i = 0; i < arr.length; i++) { 
			int current = arr[i];

			if (count > 0) {
				if (tempArr[count - 1] == current) {
					continue;
				}
			}

			tempArr[count] = current;
			count++;
		}

		int[] whitelist = new int[count];
		System.arraycopy(tempArr, 0, whitelist, 0, count);

		return whitelist;
	}
}
