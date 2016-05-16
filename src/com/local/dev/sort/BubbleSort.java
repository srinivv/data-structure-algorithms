package com.local.dev.sort;

public class BubbleSort extends $Base {

	public static void sort(int[] array) {

		int size = array.length;
		int temp = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 1; j < (size - i); j++) {
				if (array[j - 1] > array[j]) {
					// swap the elements!
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}

	}
}
