package stringPrograms;

public class ReverseTheStringWithPreservingThePositionOfSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * InPut = I Am Not String
		 * Output = g ni rtS toNmAI
		 * 
		 *  Reference Tutorial = https://javaconceptoftheday.com/how-to-reverse-the-string-with-preserving-the-position-of-spaces/
		 */

		String Original = "I Am Not String";

		String afterRemovingSpaces = Original.replaceAll(" ", "");

		char afterRS[] = afterRemovingSpaces.toCharArray();

		String ch[] = Original.split(" ");

		int temp = afterRemovingSpaces.length() - 1;

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] != null) { //Random Condition Added to go into the Loop
				for (int j = 0; j < ch[i].length(); j++) {
					System.out.print(afterRS[temp]);
					temp--;
				}
			}
			System.out.print(" ");

		}

	}

}
