package com.local.dev.sort;


public class TestBubbleSorting extends $Base {

	public static void main(String[] args) throws Exception {
		int[] input = new int[] {5, 6, 3, 1, 8, 7, 2, 4};
		int[] result;

		System.out.println("===== Heap Sort =====");
		HeapSort heap = new HeapSort();
		result = heap.sort(input);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
			System.out.print(" ");
		}
	}
	
	//*******************************
	// Udemy version of bubble sort
	//*******************************

	class BubbleSort {

		public void test() {

			int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

			for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
				for (int i = 0; i < lastUnsortedIndex; i++) {
					if (intArray[i] > intArray[i + 1]) {
						swap(intArray, i, i + 1);
					}
				}
			}

			for (int i = 0; i < intArray.length; i++) {
				System.out.println(intArray[i]);
			}

		}

		public void swap(int[] array, int i, int j) {

			if (i == j) {
				return;
			}

			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;

		}
	}
}
