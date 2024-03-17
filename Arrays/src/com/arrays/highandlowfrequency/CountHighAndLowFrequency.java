package com.arrays.highandlowfrequency;

import java.util.HashMap;
import java.util.Map;

//Problem Statement: Given an array of size N. Find the highest and lowest frequency element.
//Input: array[] = {11,6,11,14,11,6,3};
//Output: 10 15
public class CountHighAndLowFrequency {

	private static int[] countFrequency(int[] nums, int n) {

		// Brute force approach
		// Time Complexity : O(n*n)
		// Space Complexity : O(n)
		// boolean visited[] = new boolean[n];
		int maxEle = Integer.MIN_VALUE;
		int minEle = Integer.MAX_VALUE;
		int maxFreq = Integer.MIN_VALUE;
		int minFreq = Integer.MAX_VALUE;
		int[] ans = new int[2];

//		for (int i = 0; i < n; i++) {
//
//			if (visited[i] == true) {
//				continue;
//			}
//			int count = 1;
//
//			for (int j = i + 1; j < n; j++) {
//				if (nums[i] == nums[j]) {
//					count++;
//					visited[j] = true;
//				}
//			}
//
//			if (count > maxFreq) {
//				maxEle = nums[i];
//				maxFreq = count;
//			}
//			if (count < minFreq) {
//				minEle = nums[i];
//				minFreq = count;
//			}
//
//		}

		// Better approach using Hashing
		// Will make a Hash array where its length will be max element + 1.
		// Time Complexity : O(n)
		// Space Complexity :O(n)

//		int countArray[] = new int[5];
//
//		for (int i = 0; i < n; i++) {
//			countArray[nums[i]]++;
//		}
//
//		for (int i = 0; i < n; i++) {
//			if (countArray[nums[i]] != '#') {
//				if (countArray[nums[i]] > maxFreq) {
//					maxEle = nums[i];
//					maxFreq = countArray[nums[i]];
//					countArray[nums[i]] = '#';
//				}
//				if (countArray[nums[i]] < minFreq) {
//					minEle = nums[i];
//					minFreq = countArray[nums[i]];
//					countArray[nums[i]] = '#';
//				}
//			}
//		}

		// Time Complexity : O(n)
		// Space Complexity : O(n)
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(n);
		for (int i = 0; i < n; i++) {

			if (map.containsKey(nums[i])) {

				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

			Integer element = entry.getKey();
			Integer count = entry.getValue();

			if (count > maxFreq) {
				maxEle = element;
				maxFreq = count;
			}

			if (count < minFreq) {
				minEle = element;
				minFreq = count;
			}
		}
		System.out.println(maxEle + "--->" + maxFreq);
		System.out.println(minEle + "--->" + minFreq);

		ans[0] = maxEle;
		ans[1] = minEle;

		return ans;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 1, 1, 4 };
		int n = nums.length;
		countFrequency(nums, n);
	}
}
