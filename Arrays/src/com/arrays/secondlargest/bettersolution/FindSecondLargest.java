package com.arrays.secondlargest.bettersolution;

//Problem statement: Given an array, find the second largest element in the array.
//input arr [] = {4, 7, 8, 6, 7, 6}
//Output- 7
//Time Complexity : O(n) + O(n) i.e O(n)
//Space Complexity : O(1)
public class FindSecondLargest {

	private static int findSecondLargest(int[] arr, int n) {
		int flargest = Integer.MIN_VALUE;
		int slargest = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			flargest = Math.max(flargest, arr[i]);
		}

		for (int i = 0; i < n; i++) {

			if (arr[i] > slargest && arr[i] < flargest) {

				slargest = arr[i];
			}
		}

		return slargest;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 7, 8, 6, 7, 6 };
		int n = arr.length;

		System.out.println(findSecondLargest(arr, n));

	}
}
