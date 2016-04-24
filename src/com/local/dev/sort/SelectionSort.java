package com.local.dev.sort;

public class SelectionSort extends $Base {
	public int[] sort(int array[]) throws Exception {
		for (int i = 0; i < array.length; i++) {
			int min = i;

			// Find the smallest element in the unsorted list
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}

			// Swap the smallest unsorted element into the end of the sorted list.
			swap(array, min, i);
		}
		return array;
	}
	
	public void swap(int[] array, int i, int j) {
		int t = array[i];
		array[i] = array[j];
		array[j] = t;
	}
}
