package stringPrograms;

public class ValidateTwoStringAreRotationsOfEachOther {

	public static boolean CheckRotations(String str1, String str2) {

		return (str1.length() == str2.length() && (str1 + str1).contains(str2));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * The simplest solution to this complex problem is to concatenate the
		 * String with itself and check if the given rotation exists in this
		 * concatenated String. If it exists then the second string is a
		 * rotation of the first string.
		 */

		if (CheckRotations("abcde", "cdeab")) {
			System.out.println("Rotation is Correct");
		} else {
			System.out.println("Rotation is InCorrect");
		}

	}

}
