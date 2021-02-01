package stringPrograms;

/*
 * String s = "abcdef"
 * output == 123456
 */

public class FindPositionOfLetterInAlphabet {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		String s = "Abcdef!@#$".toLowerCase();
		
		String temp="";
		
		for(int i=0;i<s.length();i++){
			
			if(Character.isAlphabetic(s.charAt(i))){
				int x = (int)s.charAt(i)-96;
				temp+=x;
			}else{
				temp+=s.charAt(i);
			}
			
		}
		
		System.out.println(temp);
		
		
		
		

	}

}
