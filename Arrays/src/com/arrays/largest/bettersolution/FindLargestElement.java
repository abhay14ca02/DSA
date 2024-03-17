package com.arrays.largest.bettersolution;

//Problem statement: Given an array ‘arr’ of size ‘n’ find the largest element in the array.
//input arr [] = {4, 7, 8, 6, 7, 6}
//Output- 8
// Time Complexity : O(N)
// Space Complexity : O(1)
public class FindLargestElement {

	private static int findLargest(int[] arr, int n) {

		int largest = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {

			if (arr[i] > largest) {
				largest = arr[i];
			}
		}

		return largest;

	}

	public static void main(String[] args) {
		int arr[] = { 4, 7, 8, 6, 7, 6 };
		int n = arr.length;
		System.out.println("Largest Element is: "+findLargest(arr, n));

	}

}
