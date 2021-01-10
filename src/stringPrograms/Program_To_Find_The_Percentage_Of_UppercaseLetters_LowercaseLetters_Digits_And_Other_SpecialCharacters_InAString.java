package stringPrograms;

public class Program_To_Find_The_Percentage_Of_UppercaseLetters_LowercaseLetters_Digits_And_Other_SpecialCharacters_InAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "Tiger Runs @ The Speed Of 100 km/hour.";
		
	    int percentageOfUpperCaseletters = s.replaceAll("[^A-Z]", "").length();
	    System.out.println((percentageOfUpperCaseletters*100)/s.length());
	    
	    int percentageOfLowerCaseletters = s.replaceAll("[^a-z]", "").length();
	    System.out.println((percentageOfLowerCaseletters*100)/s.length());
	    
	    int percentageOfDigits = s.replaceAll("[^0-9]","").length();
	    System.out.println((percentageOfDigits*100)/s.length());
	    
	    //Need to Check
	    
	    //var pattern = 
	    
	   int percentageOfSpecialCharacters=(s.replaceAll("\\w", "")).length();
	    System.out.println((percentageOfSpecialCharacters*100)/s.length());
	    
	    
        	    
		

	}

}
