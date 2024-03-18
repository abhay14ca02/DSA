package com.arrays.leftrotatebydplace;

//Problem Statement: Given an array of integers, rotate array of elements by d places/elements in left
//input[] array = {3,7,8,9,10,11} , d=3
//Output: 9 10 11 3 7 8
//Time Complexity : O(d) + O(n-d) + O(d)  i.e O(n+d)
//Space Complexity :O(d)
public class BetterSolution {

	private static int[] rotateArray(int[] arr, int n, int d) {

		d = d % arr.length;

		int temp[] = new int[d];

		for (int i = 0; i < d; i++) {// O(n)

			temp[i] = arr[i];
		}

//		for (int i = 0; i < n - d; i++) {   We can apply this logic as well as below logic
//		      arr[i] = arr[i + d];
//		    }

		for (int i = d; i < n; i += 1) {//O(n-d)

			arr[i - d] = arr[i];
		}

//		int j=0;
//		for (int i = n - d; i < n; i++) {
//
//			arr[i]=temp[j];
//			j++;
//		}

		for (int i = n - d; i < n; i++) {// O(d)

			arr[i] = temp[i - (n - d)];
		}

		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 7, 8, 9, 10, 11 };
		int n = arr.length;
		int d = 3;
		int result[] = rotateArray(arr, n, d);
		for (int i = 0; i < result.length; i++) {

			System.out.print(result[i] + " ");
		}
	}

}
