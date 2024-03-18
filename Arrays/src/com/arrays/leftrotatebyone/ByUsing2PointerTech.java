package com.arrays.leftrotatebyone;

//Input: N = 5, array[] = {1,2,3,4,5}
//Output: 2,3,4,5,1
//Time Complexity : O(n)
//Space Complexity : O(1)
//We will take 2 pointers i and j which point last and first element of array respectively.
// Start swapping arr[i] and arr[j] and keep j fixed and i moving towards j.

public class ByUsing2PointerTech {

	private static int[] leftRotateByOne(int[] arr, int n) {

		int i = n - 1;
		int j = 0;

		while (i > j) {

			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i--;

		}
		return arr;

	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5 };
		int n = array.length;
		int result[] = leftRotateByOne(array, n);
		System.out.print("Array after one rotation: ");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
