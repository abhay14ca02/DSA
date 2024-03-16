package com.arrays.countfreqdigit;

import java.util.HashMap;
import java.util.Map;

// Problem statement: Given an array, we have to find the number of occurrences of each element in the array.
// Input: arr[] = {11,5,6,11,15,11,5,6};
// Output: 11 ---> 3
//          5 ---> 2
//          6 ---> 2
//         15 --->1
public class CountFreqDigit {

	private static void countFreqOfDigit(int[] arr, int n) {

		// Brute force approach
		// Time complexity : O(n*n) - We've taken one loop for iterating an array and
		// another loop for doing comparison of elements
		// Space complexity : O(n) for boolean array

//		boolean[] visited = new boolean[n];
//
//		for (int i = 0; i < n; i++) {
//
//			if (visited[i] == true) {
//				continue;
//			}
//			int count = 1;
//
//			for (int j = i + 1; j < n; j++) {
//
//				if (arr[i] == arr[j]) {
//
//					visited[j] = true;
//					count++;
//				}
//			}
//
//			System.out.println(arr[i] + "--->" + count);
//		}

		// Further we can optimize the extra space but time complexity will be O(n*n)

//		for (int i = 0; i < n; i++) {
//
//			int count = 1;
//			for (int j = i + 1; j < n; j++) {
//
//				if (arr[i] == arr[j]) {
//					arr[j] = Integer.MIN_VALUE;
//					count++;
//				}
//			}
//			if (arr[i] != Integer.MIN_VALUE) {
//				System.out.println(arr[i] + "--->" + count);
//			}
//
//		}

		// Better approach, we can use Hashing here
		// Time complexity will be reduced to O(n) and Space complexity will be O(n)

		// First, We need to find the maximum element from an array then length hashing array will be maxElement + 1
		// In the given array max element is 15, so length will be 15 + 1=16

//		int[] countFreqArray = new int[16];
//		for (int i = 0; i < n; i++) {
//			countFreqArray[arr[i]]++;
//		}
//
//		for (int i = 0; i < n; i++) {
//			if (countFreqArray[arr[i]] != Integer.MIN_VALUE) {
//				System.out.println(arr[i] + "--->" + countFreqArray[arr[i]]);
//				countFreqArray[arr[i]] = Integer.MIN_VALUE;
//			}
//		}

		// Better approach, we can HashMap here.
		// Time Complexity : O(n)
		// Space Complexity : O(n)

		Map<Integer, Integer> map = new HashMap<Integer, Integer>(n);

		for (int i = 0; i < n; i++) {

			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "--->" + entry.getValue());
		}
	}

	public static void main(String[] args) {

		int[] arr = { 11, 5, 6, 11, 15, 11, 5, 6 };
		int n = arr.length;

		countFreqOfDigit(arr, n);
	}
}
