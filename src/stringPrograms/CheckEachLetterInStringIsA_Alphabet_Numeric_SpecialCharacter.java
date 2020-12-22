package stringPrograms;

public class CheckEachLetterInStringIsA_Alphabet_Numeric_SpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "Aa10!@";
		
		for(int i=0;i<s.toCharArray().length;i++){
			
			if(Character.isAlphabetic(s.charAt(i))) System.out.print("Alphabet ");
			else if (Character.isDigit(s.charAt(i))) System.out.print("Numeric ");
			else  System.out.print("Special Character ");
			
		}
		
		

	}

}
