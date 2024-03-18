package com.arrays.leftrotatebydplace;

//Problem Statement: Given an array of integers, rotate array of elements by d places/elements in left
//input[] array = {3,7,8,9,10,11} , d=3
//Output: 9 10 11 3 7 8
//Time Complexity : O(d) + O(n-d) + O(n) i.e O(2n)
//Space Complexity :O(1)
public class OptimalSolution {

	private static int[] rotateArray(int[] nums, int n, int d) {

		int start = 0;
		int end = n - 1;
		d = d % n;
		reverse(nums, start, d - 1);
		reverse(nums, d, end);
		reverse(nums, start, end);

		return nums;
	}

	private static void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[end];
			nums[end] = nums[start];
			nums[start] = temp;
			start += 1;
			end -= 1;
		}

	}

	public static void main(String[] args) {
		int[] arr = { 3, 7, 8, 9, 10, 11 };
		int n = arr.length;
		int d = 3;
		int result[] = rotateArray(arr, n, d);
		for (int i = 0; i < result.length; i++) {

			System.out.print(result[i] + " ");
		}
	}

}
