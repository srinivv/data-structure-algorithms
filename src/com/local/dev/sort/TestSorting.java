package com.local.dev.sort;


public class TestSorting extends $Base {

	public static void main(String[] args) throws Exception {
		int[] input = new int[] {5, 6, 3, 1, 8, 7, 2, 4};
		int[] result;

		System.out.println("===== Insertion Sort =====");
		InsertionSort insertion = new InsertionSort();
		result = insertion.sort(input);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
			System.out.print(" ");
		}

		System.out.println();
		System.out.println("===== Selection Sort =====");
		input = new int[] {5, 6, 3, 1, 8, 7, 2, 4};
		SelectionSort selection = new SelectionSort();
		result = selection.sort(input);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
			System.out.print(" ");
		}
	
		System.out.println();
		System.out.println("===== Merge Sort =====");
		MergeSort merge = new MergeSort();
		result = merge.sort(input);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
			System.out.print(" ");
		}

		System.out.println();
		System.out.println("===== Quick Sort =====");
		input = new int[] {5, 6, 3, 1, 8, 7, 2, 4};
		QuickSort quick = new QuickSort();
		result = quick.sort(input);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
			System.out.print(" ");
		}

		System.out.println();
		System.out.println("===== Heap Sort =====");
		HeapSort heap = new HeapSort();
		result = heap.sort(input);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
			System.out.print(" ");
		}
	}
}
