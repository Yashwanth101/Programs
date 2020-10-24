package stringPrograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class PrintNumberOfLines_CharactersAndWordsInATextFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(
				new FileReader("G:\\Job_Selenium\\StringPrograms\\New Text Document.txt"));

		int lines = 0;

		String text = null;
		String word = "";

		while ((text = br.readLine()) != null) {
			if (!(text.isEmpty())) {
				lines++;
				word += text + " ";
			}
		}

		System.out.println(word);
		System.out.println(lines);

		String words[] = word.split(" ");
		System.out.println(words.length);

		char[] characteres = word.replaceAll("\\s+", "").toCharArray();
		System.out.println(characteres.length);

	}

}
