package com.local.dev.universal.all;

import java.util.Arrays;

/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4
 */
public class $26SingleNumber {

	public int singleNumber(int[] nums) {
		int a = 0;
		for (int i : nums) {
			a ^= i;
		}
		return a;
	}

	public int singleNumber2(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i = i + 2) {
			if (i + 1 < nums.length) {
				if (nums[i] != nums[i + 1]) {
					return nums[i];
				}
			} else {
				return nums[i];
			}
		}
		return 0;
	}
}
