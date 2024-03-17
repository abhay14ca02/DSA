package com.arrays.secondsmallest;

//Problem statement: Given an array, find the second smallest element in the array.
//input arr [] = {4, 7, 8, 6, 7, 6, 6, 5, 1}
//Output- 4
//Time Complexity : O(n)
//Space Complexity : O(1)
public class OptimalSolution {

	private static int findSSmallest(int[] arr, int n) {

		int fsmallest = Integer.MAX_VALUE;
		int smallest = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {

			if (arr[i] < fsmallest) {

				smallest = fsmallest;
				fsmallest = arr[i];
			}
			if (arr[i] < smallest && arr[i] > fsmallest) {

				smallest = arr[i];
			}
		}

		return smallest;
	}

	public static void main(String[] args) {

		int[] arr = { 4, 7, 8, 6, 7, 6, 6, 5, 1 };
		int n = arr.length;
		System.out.println(findSSmallest(arr, n));

	}
}
