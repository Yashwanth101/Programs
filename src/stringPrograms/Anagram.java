package stringPrograms;

import java.util.ArrayList;
import java.util.ListIterator;

/*
 *  1. Validate length of Both the Strings, if not equal, return false
 * 
 * 
 */

public class Anagram {

	public static boolean validateAnagram(String str1, String str2) {

		if (str1.length() != str2.length())
			return false;

		int[] str1Array = new int[256];

		int[] str2Array = new int[256];

		for (char c : str1.toCharArray()) {
			int index = (int) c;
			str1Array[index]++;
		}

		for (char c : str2.toCharArray()) {
			int index = (int) c;
			str2Array[index]++;
		}

		for (int i = 0; i < 256; i++) {
			if (str1Array[i] != str2Array[i]) {
				return false;

			}
		}

		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (validateAnagram("aab", "aba")) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}
		
		
	}

}
