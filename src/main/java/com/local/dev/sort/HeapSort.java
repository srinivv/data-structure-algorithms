package com.local.dev.sort;

public class HeapSort {

/*	
	The heapsort algorithm can be divided into two parts.
	In the first step, a heap is built out of the data.
	In the second step, a sorted array is created by repeatedly removing the largest element from the heap, 
  		and inserting it into the array. The heap is reconstructed after each removal. Once all objects have been removed from the heap, we have a sorted array. 
  	The direction of the sorted elements can be varied by choosing a min-heap or max-heap in step one.
		Heapsort can be performed in place. The array can be split into two parts, the sorted array and the heap. 
  	The storage of heaps as arrays is diagrammed here. The heap's invariant is preserved after each extraction, so the only cost is that of extraction.
*/
	public int[] sort(int[] array) {
		buildheap(array);

		int end = array.length - 1; 
		for (int i = end; i > 0; i--) {
			swap(array, 0, i);
			end = end - 1;
			maxheap(array, 0, end);
		}
		
		return array;
	}

	public void buildheap(int[] array) {
		int end = array.length - 1;
		for (int i = end / 2; i >= 0; i--) {
			maxheap(array, i, end);
		}
	}

	public void maxheap(int[] array, int start, int end) {
		int left = 2 * start;
		int right = 2 * start + 1;
		int largest;
		
		if (left <= end && array[left] > array[start]) {
			largest = left;
		} else {
			largest = start;
		}

		if (right <= end && array[right] > array[largest]) {
			largest = right;
		}
		if (largest != start) {
			swap(array, start, largest);
			maxheap(array, largest, end);
		}
	}

	public void swap(int[] array, int i, int j) {
		int t = array[i];
		array[i] = array[j];
		array[j] = t;
	}
}