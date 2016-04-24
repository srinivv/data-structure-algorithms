package com.local.dev.sort;

public class QuickSort {
	public int[] sort(int array[]) {
		return sort(array, 0, array.length - 1); 
	}

	public int[] sort(int array[], int start, int end) {
		int left = start; // index of left-to-right scan
		int right = end; // index of right-to-left scan

		// check that there are at least two elements to  sort
		if (start >= end) { 
			return array;
		}
		
		// set the pivot as the first element in the partition
		int pivot = array[start]; 

		// while the scan indices from left and right have not met,
		while (right > left) { 
			
			// from the left, look for the first
			while (array[left] <= pivot && left <= end && right > left) 
				left++; // element greater than the pivot
			
			// from the right, look for the first
			while (array[right] > pivot && right >= start && right >= left) 
				right--; // element not greater than the pivot
			
			// if the left, seek index is still smaller than
			if (right > left)  {
				// the right index, swap the corresponding elements
				swap(array, left, right); 
			}
				
		}
		// after the indices have crossed, 
		// swap the last element in the left partition with  the pivot
		swap(array, start, right); 
		sort(array, start, right - 1); // sort the left partition
		sort(array, right + 1, end); // sort the right partition

		return array;
	}

	public void swap(int array[], int i, int j) {
		int temp = array[i]; 
		array[i] = array[j]; 
		array[j] = temp; 
	}
}
