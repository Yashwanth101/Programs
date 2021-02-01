package stringPrograms;

import java.util.Arrays;
import java.util.HashSet;

//http://makeseleniumeasy.com/2018/08/24/frequently-asked-java-program-20-java-program-to-find-missing-alphabets-in-given-string/

public class Find_Missing_Alphabets_In_Given_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Amod Mahajan";
		
		String[] originalString = s.split("");
		
		String[] alphabets = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
		
		HashSet<String> ori = new HashSet<>(Arrays.asList(originalString));
		
		HashSet<String> alpha = new HashSet<>(Arrays.asList(alphabets));
		
		alpha.removeAll(ori);
		
		System.out.println(alpha);
		
		
		
		
		
		

	}

}
