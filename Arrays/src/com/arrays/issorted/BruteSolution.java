package com.arrays.issorted;

//Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. 
//If the array is sorted then return True, Else return False.
//input [] arr = {1,2,3,4,5} 
//Time Complexity : O(n*n)
//Space Complexity : O(1)
public class BruteSolution {

	private static boolean isSorted(int[] arr, int n) {

		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {

				if (arr[i] > arr[j]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int n = arr.length;
		System.out.println(isSorted(arr, n));

	}
}
