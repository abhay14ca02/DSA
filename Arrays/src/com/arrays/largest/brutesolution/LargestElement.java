package com.arrays.largest.brutesolution;

import java.util.Arrays;

//Problem statement: Given an array ‘arr’ of size ‘n’ find the largest element in the array.
// input arr [] = {4, 7, 8, 6, 7, 6}
// Output- 8
// First we will sort the array, then maximum element will be arr[arr.length-1]
// Time Complexity : O(n*logn)
// Space Complexity : O(1)
public class LargestElement {

	private static int findLargest(int[] arr) {

		Arrays.sort(arr);

		return arr[arr.length - 1];

	}

	public static void main(String[] args) {

		int[] input = { 4, 7, 8, 6, 7, 6 };
		
		int largest = findLargest(input);
		System.out.println(largest);

	}
}
