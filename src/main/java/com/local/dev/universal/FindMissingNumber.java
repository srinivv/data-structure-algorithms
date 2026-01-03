package com.local.dev.universal;

// To find missing Number

/*
	You are given a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in the list. One of the integers is missing in the list. Write an efficient code to find the missing integer.
	
	Example:
	Input: arr[] = {1, 2, 4, 6, 3, 7, 8}
	Output: 5
	Explanation: The missing number from 1 to 8 is 5

	Input: arr[] = {1, 2, 3, 5}
	Output: 4
	Explanation: The missing number from 1 to 5 is 4
	
	Method 1: This method uses the technique of the summation formula. 

	Approach: The length of the array is n-1. So the sum of all n elements, i.e sum of numbers from 1 to n can be calculated using the formula n*(n+1)/2. Now find the sum of all the elements in the array and subtract it from the sum of first n natural numbers, it will be the value of the missing element.
	Algorithm: 
		Calculate the sum of first n natural numbers as sumtotal= n*(n+1)/2
		Create a variable sum to store the sum of array elements.
		Traverse the array from start to end.
		Update the value of sum as sum = sum + array[i]
		Print the missing number as sumtotal sum
 */
public class FindMissingNumber {
	
	static int getMissingNo(int a[], int n) {
		int i, total;
		total = (n + 1) * (n + 2) / 2;
		for (i = 0; i < n; i++)
			total -= a[i];
		return total;
	}

	public static void main(String args[]) {
		int a[] = { 1, 2, 4, 5, 6 };
		int miss = getMissingNo(a, 5);
		System.out.println(miss);
	}
}
