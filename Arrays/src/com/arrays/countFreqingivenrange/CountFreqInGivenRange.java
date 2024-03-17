package com.arrays.countFreqingivenrange;

//Problem statement: You are given an array 'arr' of length 'n' containing integers within the range '1' to 'x'.
//Your task is to count the frequency of all elements from 1 to n.
// Time complexity : O(n)
// Space Complexity: O(n)
public class CountFreqInGivenRange {

	public static int[] countFrequency(int n, int x, int[] nums) {

		// int [] ans = new int[n+1];
		int[] countArr = new int[x + 1];

		for (int i = 0; i < nums.length; i++) {

			countArr[nums[i] - 1]++;
		}

		for (int i = 0; i < n; i++) {
			countArr[i % n] = countArr[i];
		}
		return countArr;
	}

	public static void main(String[] args) {

		int n = 10;
		int x = 14;
		int[] nums = { 11, 14, 8, 3, 12, 14, 1, 7, 4, 3 };
		int[] ans = countFrequency(n, x, nums);
		for (int i = 0; i < n; i++) {
			System.out.println(ans[i]);

		}

	}
}
