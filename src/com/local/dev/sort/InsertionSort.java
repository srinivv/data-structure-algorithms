package com.local.dev.sort;

public class InsertionSort extends $Base {

	public int[] sort(int array[]) throws Exception {
		for (int i = 1; i < array.length; i++) {
			int j = i;
			int second = array[i];
			while ((j > 0) && (array[j - 1] > second)) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = second;
		}
		return array;
	}

}
