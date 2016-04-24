package com.local.dev.sort;

public class MergeSort {
	public int[] sort(int array[], int low, int high) throws Exception {
		int first = low;
		int last = high;

		if (first >= last) {
			return array;
		}
		int mid = (first + last) / 2;
		
		// Partition the list into two lists and sort them recursively
		sort(array, first, mid);
		sort(array, mid + 1, last);
		
		// Merge the two sorted lists
		int end_lo = mid;
		int start_hi = mid + 1;
		while ((first <= end_lo) && (start_hi <= last)) {

			if (array[first] < array[start_hi]) {
				first++;
			} else {
				// a[start] >= a[start_hi] The next element comes from the second list, 
				// move the a[start_hi] element into the next position 
				// and shuffle all the other elements up.
				int temp = array[start_hi];
				for (int i = start_hi - 1; i >= first; i--) {
					array[i + 1] = array[i];
				}
				array[first] = temp;
				first++;
				end_lo++;
				start_hi++;
			}
		}
		return array;
	}

	public int[] sort(int array[]) throws Exception {
		return sort(array, 0, array.length - 1);
	}
}
