package com.local.dev;

import java.util.HashSet;
import java.util.Set;

public class Duplicates {
	
	public static void removeDupes(int[] arr) {
		Set<Integer> noDupe = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			noDupe.add(arr[i]);
		}
		
		noDupe.forEach(System.out::print);
	}
	
	// Below code works when array is sorted (with duplicates)
	public static int[] removeDuplicates(int[] arr) {
		// or simply - Arrays.sort(arr);
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
	
	public static int[] removeDuplicatesByBooleanArray(int[] arr) {
		boolean[] isSame = new boolean[arr.length];
		int dupCount = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < isSame.length; j++) {
				if (arr[j] == arr[i]) {
					isSame[j] = true;
					dupCount++;
				}
			}
		}
		
		int[] result = new int[arr.length - dupCount];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isSame[i] != true) {
				result[count] = arr[i];
				count++;
			}
		}
				
		return result;
	}
}
