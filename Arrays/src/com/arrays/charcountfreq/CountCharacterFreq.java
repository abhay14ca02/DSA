package com.arrays.charcountfreq;

import java.util.HashMap;
import java.util.Map;

//Problem statement: Given a string, we have to find the number of occurrences of each character in the string.
// input str = "abcadefgagaz";
public class CountCharacterFreq {

	private static void countCharFrequency(String word, int n) {

		// Brute force approach
		// Time complexity : O(n*n) - We've taken one loop for iterating an array and another loop for doing comparison of elements
		// Space complexity : O(n) for boolean array
//		boolean[] visited = new boolean[n];
//
//		for (int i = 0; i < n; i++) {
//
//			if (visited[i] == true) {
//				continue;
//			}
//			int count = 1;
//			for (int j = i + 1; j < n; j++) {
//				if (word.charAt(i) == word.charAt(j)) {
//					count++;
//					visited[j] = true;
//				}
//			}
//
//			System.out.println(word.charAt(i) + "-->" + count);
//		}

		// Further we can optimize the extra space but time complexity will be O(n*n)

//		char charArray[] = word.toCharArray();
//		for (int i = 0; i < n; i++) {
//			int count = 1;
//			for (int j = i + 1; j < n; j++) {
//				if (charArray[i] == charArray[j]) {
//					count++;
//					charArray[j] = '#';
//				}
//			}
//			if (charArray[i] != '#') {
//				System.out.println(charArray[i] + "-->" + count);
//			}
//		}

		// Better approach, we can use Hashing here
		// Time complexity will be reduced to O(n) and Space complexity will be O(n)
		// If we have only Small/Capital letters in the given characters then we can take the length of Hash array is 26.
		// If we have Small, Capital letters and digits/Special characters then we can take the length of Hash array is 256[0-255]

//		int charArray[] = new int[26];
//
//		for (int i = 0; i < n; i++) {
//			charArray[word.charAt(i) - 'a']++;
//		}
//
//		// printing the array
//		for (int i = 0; i < n; i++) {
//			if (charArray[word.charAt(i) - 'a'] != '#') {
//				System.out.println(word.charAt(i) + "-->" + charArray[word.charAt(i) - 'a']);
//				charArray[word.charAt(i) - 'a'] = '#';
//			}
//
//		}

//		int charArray[] = new int[256];
//
//		for (int i = 0; i < n; i++) {
//
//			charArray[word.charAt(i)]++;
//		}
//
//		// printing the array
//		for (int i = 0; i < n; i++) {
//
//			if (charArray[word.charAt(i)] != '#') {
//
//				System.out.println(word.charAt(i) + "-->" + charArray[word.charAt(i)]);
//				charArray[word.charAt(i)] = '#';
//
//			}
//		}

		// Better approach, we can HashMap here.
		// Time Complexity : O(n)
		// Space Complexity : O(n)
		
		Map<Character, Integer> map = new HashMap<Character, Integer>(n);

		for (int i = 0; i < n; i++) {

			if (map.containsKey(word.charAt(i))) {
				map.put(word.charAt(i), map.get(word.charAt(i)));
			} else {
				map.put(word.charAt(i), 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			Character key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + "--->" + val);

		}
	}

	public static void main(String[] args) {

		// String word = "abcdefgagazbcq";
		String word = "Abd0EAfDagaz09bB9q";
		int n = word.length();
		countCharFrequency(word, n);
	}
}
