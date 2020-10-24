package stringPrograms;

/*
 * 
 * Ex - Given String  -- 2a5b3c2d1e 
 * Output = aabbbbbcccdde
 * 
 * 
 */

public class PrintAlphabetsBasedOnNumbersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "2a5b3c2d1e";

		for (int i = 0; i < str.length() - 1; i++) {

			if (!(Character.isAlphabetic(str.charAt(i)))) {

				int k = Integer.parseInt(String.valueOf(str.charAt(i)));

				for (int j = 0; j < k; j++) {

					System.out.print(str.charAt(i + 1));

				}

			}

		}

	}

}
