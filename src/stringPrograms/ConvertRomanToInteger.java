package stringPrograms;

import java.util.HashMap;

public class ConvertRomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "MCMXCIV";
		int sum = 0;

		HashMap<Character, Integer> storeRomanValues = new HashMap<>();

		storeRomanValues.put('I', 1);
		storeRomanValues.put('V', 5);
		storeRomanValues.put('X', 10);
		storeRomanValues.put('L', 50);
		storeRomanValues.put('C', 100);
		storeRomanValues.put('D', 500);
		storeRomanValues.put('M', 1000);

		for (int i = 0; i < str.length() - 1; i++) {

			if (storeRomanValues.get(str.charAt(i)) < storeRomanValues.get(str.charAt(i + 1))) {

				sum -=storeRomanValues.get(str.charAt(i));

			} else {
				sum +=storeRomanValues.get(str.charAt(i));
			}

		}

		sum = sum + storeRomanValues.get(str.charAt(str.length() - 1));

		System.out.println(sum);

	}

}
