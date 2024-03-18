package com.arrays.leftrotatebyone;

//Input: N = 5, array[] = {1,2,3,4,5}
//Output: 2,3,4,5,1
//Time Complexity : O(n)
//Space Complexity : O(n)
public class BruteSolution {

	private static int[] leftRotateByOne(int[] array, int n) {

		int temp[] = new int[n];

		for (int i = 0; i < n - 1; i++) {

			temp[i] = array[i + 1];
		}
		temp[n - 1] = array[0];

		return temp;

	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5 };
		int n = array.length;
		int result[] = leftRotateByOne(array, n);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

}
