package com.arrays.secondlargest.optimalsolution;

//Problem statement: Given an array, find the second largest element in the array.
//input arr [] = {4, 7, 8, 6, 7, 6, 6, 5, 1}
//Output- 7
//Time Complexity : O(n)
//Space Complexity : O(1)
public class FindSecondLargest {

	private static int findSecondLargest(int[] arr, int n) {

		int flargest = Integer.MIN_VALUE;
		int slargest = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {

			if (arr[i] > flargest) {
				slargest = flargest;
				flargest = arr[i];
			}
			if (arr[i] > slargest && arr[i] < flargest) {

				slargest = arr[i];
			}
		}

		return slargest;
	}

	public static void main(String[] args) {

		int[] arr = { 4, 7, 8, 6, 7, 6, 6, 5, 1 };
		int n = arr.length;
		System.out.println(findSecondLargest(arr, n));
	}

}
