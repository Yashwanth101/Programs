package stringPrograms;

import java.util.HashSet;

public class LongestSubStringWithOutRepeatedCharacters {

	public static int longestSubString(String s) {

		int i = 0;
		int j = 0;
		int max = 0;

		HashSet<Character> hashSet = new HashSet<>();

		while (j < s.length()) {

			if (!hashSet.contains(s.charAt(j))) {
				hashSet.add(s.charAt(j));
				j++;
				max = Math.max(hashSet.size(), max);
			} else {
				hashSet.remove(s.charAt(i));
				i++;
			}

		}
		System.out.println(hashSet);
		return max;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(longestSubString("abcabcdef"));

	}

}
