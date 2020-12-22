package stringPrograms;

import java.util.Arrays;

public class FindAndPrintAllSpecialCharacterswithTheirPositionsinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "Make%Selenium$Easy#";
		
		for(int i=0;i<s.length();i++){
			
			if(!(Character.isDigit(s.charAt(i))||Character.isAlphabetic(s.charAt(i)))){
				System.out.println(s.charAt(i)+"At Position"+(i+1));
			}
			
		}
		
		
		
		

	}

}
