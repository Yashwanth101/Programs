package stringPrograms;

public class PrintWordsBeforeSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abc$bca$123";
		
		for(int i=0;i<s.length();i++){
			
			if((Character.isAlphabetic(s.charAt(i))||(Character.isDigit(s.charAt(i))))){
				System.out.print(s.charAt(i));
			
			}
			
		}
		
		
		
		
		

	}

}
