package stringPrograms;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Regex {
	
	
	public static void main(String[] args){
		
		// Method -1
		
		String content = "This is Chaitanya " +
			    "from Beginnersbook.com.";
		
		String pattern = ".*Beginnersbook.*";
		
		System.out.println(Pattern.matches(pattern, content));
		
		
		// Method -2 
		
		String content_1 = "This is a tutorial Website!";
		String patternString = ".*tuToRiAl.";
		
		System.out.println(Pattern.compile(content_1,Pattern.CASE_INSENSITIVE));
		
		
		
		// Regex Shortcuts
		
		String mainString = "Yashwanth8020 !@#$%^&*() T";
		
		// Replace all digits with D
        String allDigits = mainString.replaceAll("[\\d]", "D");
        System.out.println(allDigits);
        
        // Replace everything with space other than the Digits
		String onlyDigits = mainString.replaceAll("[\\D]", "");
		System.out.println(onlyDigits);
		
		// Remove spaces from the String
		String removeSpaces = mainString.replaceAll("[\\s]", "");
		System.out.println(removeSpaces);
		
		// Remove everything except spaces
		String removeEverythingExceptSpaces = mainString.replaceAll("[\\S]", "N");
		System.out.println(removeEverythingExceptSpaces);
		
		// Replace a wordCharacter with 0
		String removeWord = mainString.replaceAll("[\\w]", "0");
		System.out.println(removeWord);
		
		// Replace everything except the Word and digit
		String replaceEverythingExceptWord = mainString.replaceAll("[\\W]", "0");
		System.out.println(replaceEverythingExceptWord);
		
		
		
		
		
		
		
	}

}
