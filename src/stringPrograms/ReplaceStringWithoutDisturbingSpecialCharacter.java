package stringPrograms;

public class ReplaceStringWithoutDisturbingSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Pa$$w0rd";

		String specialCharacters = s.replaceAll("[^@#$%^&*()!_+\\-=\\[\\]{};':\"\\\\|,.<>\\/? 0-9]", "");
		String alphabets = s.replaceAll("[^a-zA-Z]", "");

		System.out.println(specialCharacters);
		System.out.println(alphabets);

		int a = 0, b = alphabets.length() - 1;

		for (int i = 0; i < s.length(); i++) {

			if (Character.isAlphabetic(s.charAt(i))) {
				System.out.print(alphabets.charAt(b));
				b--;
			} else {
				System.out.print(specialCharacters.charAt(a));
				a++;
			}

		}

	}

}
