package com.arrays.leftrotatebydplace;

// Problem Statement: Given an array of integers, rotate array of elements by d places/elements in left
// input[] array = {3,7,8,9,10,11} , d=3
// Output: 9 10 11 3 7 8
// Time Complexity : O(d*n)
// Space Complexity :O(1)
public class BruteSolution {

	private static int[] leftRotateByDPlaces(int[] arr, int n, int d) {

		d = d % n;
		System.out.println(d);
		while (d > 0) {
			int temp = arr[0];
			for (int i = 0; i < n - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[n - 1] = temp;
			d--;
		}

		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 7, 8, 9, 10, 11 };
		int d = 3;
		int n = arr.length;

		int result[] = leftRotateByDPlaces(arr, n, d);
		System.out.println("Array after left rotation: ");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

}
