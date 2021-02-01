package stringPrograms;

public class OccuranceOfEachCharacterInAString_WithOutUsing_Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcab".toLowerCase();

		while (s.length() >= 1) {

			char startIndex = s.charAt(0);

			int count = 0;

			for (int j = 0; j < s.length(); j++) {

				if (startIndex == s.charAt(j)) {
					count++;
				}
			}

			if (count == 0) {
				System.out.println("Count of " + startIndex + " is: 1");
			} else if (Character.isWhitespace(startIndex)) {
				System.out.println("Occurrence of whitespace : " + count);
			} else {
				System.out.println("Count of " + startIndex + " is: " + count);
			}

			s = s.replace(String.valueOf(startIndex), "");

		}

	}

}
