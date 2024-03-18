package com.arrays.issorted;

//Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. 
//If the array is sorted then return True, Else return False.
//input [] arr = {1,2,3,4,5} 
//Time Complexity : O(n)
//Space Complexity : O(1)
public class OptimalSolution {

	private static boolean isSorted(int[] arr, int n) {

		for (int i = 0; i < n - 1; i++) {

			if (arr[i] > arr[i + 1]) {

				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 2, 3, 4, 5, 6 };
		int n = arr.length;
		System.out.println(isSorted(arr, n));
	}

}
