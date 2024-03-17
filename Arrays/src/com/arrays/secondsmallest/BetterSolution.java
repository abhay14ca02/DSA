package com.arrays.secondsmallest;

//Problem statement: Given an array, find the second smallest element in the array.
//input arr [] = {4, 7, 8, 6, 7, 6, 6, 5, 1}
//Output- 4
//Time Complexity : O(n) + O(n) i.e O(n)
//Space Complexity : O(1)
public class BetterSolution {

	private static int findSSmallest(int[] arr, int n) {

		int fsmallest = Integer.MAX_VALUE;
		int ssmallest = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {

			fsmallest = Math.min(fsmallest, arr[i]);
		}

		for (int i = 0; i < n; i++) {
			if (arr[i] < ssmallest && arr[i] > fsmallest) {
				ssmallest = arr[i];
			}
		}
		return ssmallest;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 7, 8, 6, 7, 6, 6, 5, 1};
		int n = arr.length;
		System.out.println(findSSmallest(arr, n));
	}
}
