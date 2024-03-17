package com.arrays.secondlargest.brutesolution;

import java.util.Arrays;

//Problem statement: Given an array, find the second largest element in the array.
//input arr [] = {4, 7, 8, 6, 7, 6}
//Output- 7
//Time Complexity : O(n*logn)
// Space Complexity : O(1)
public class FindSecondLargest {

	private static int findSecondLargest(int[] arr, int n) {

		Arrays.sort(arr);

		return arr[n - 2];
	}

	public static void main(String[] args) {

		int arr[] = { 4, 7, 8, 6, 7, 6 };
		int n = arr.length;
		int secondLargest = findSecondLargest(arr, n);
		System.out.println(secondLargest);
	}
}
