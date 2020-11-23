package com.local.dev.universal;

// To search an element in sorted and rotated array using single pass of Binary Search

/*
	An element in a sorted array can be found in O(log n) time via binary search. 
	But suppose we rotate an ascending order sorted array at some pivot unknown to you beforehand. 
	So for instance, 1 2 3 4 5 might become 3 4 5 1 2. 
	
	Devise a way to find an element in the rotated array in O(log n) time.
	
	Example:
	
	Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
         key = 3
	Output : Found at index 8

	Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
         key = 30
	Output : Not found

	Input : arr[] = {30, 40, 50, 10, 20}
        key = 10   
	Output : Found at index 3
 */
public class SearchInRotatedArray {

	// Returns index of key in arr[l..h] 
    // if key is present, otherwise returns -1 
    static int search(int arr[], int l, int h, int key)  { 
        if (l > h) 
            return -1; 
  
        int mid = (l + h) / 2; 
        if (arr[mid] == key) 
            return mid; 
  
        /* If arr[l...mid] first subarray is sorted */
        if (arr[l] <= arr[mid]) { 
            /* As this subarray is sorted, we  
               can quickly check if key lies in  
               half or other half */
            if (key >= arr[l] && key <= arr[mid]) 
                return search(arr, l, mid - 1, key); 
            /*If key not lies in first half subarray,  
           Divide other half  into two subarrays, 
           such that we can quickly check if key lies  
           in other half */
            return search(arr, mid + 1, h, key); 
        } 
  
        /* If arr[l..mid] first subarray is not sorted,  
           then arr[mid... h] must be sorted subarry*/
        if (key >= arr[mid] && key <= arr[h]) 
            return search(arr, mid + 1, h, key); 
  
        return search(arr, l, mid - 1, key); 
    } 

	public static void main(String args[]) {
		int arr[] = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
		int n = arr.length;
		int key = 6;
		int i = search(arr, 0, n - 1, key);
		if (i != -1)
			System.out.println("Index: " + i);
		else
			System.out.println("Key not found");
	}
}
