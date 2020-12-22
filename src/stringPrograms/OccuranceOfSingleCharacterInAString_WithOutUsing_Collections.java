package stringPrograms;

public class OccuranceOfSingleCharacterInAString_WithOutUsing_Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "Make Selenium Easy";
		
		int originalLengthOfString = s.length();
		
		int afterReplacing = s.replace("e", "").length();
		
		
		System.out.println("Number Of Characters is:" + (originalLengthOfString-afterReplacing));
		

	}

}
