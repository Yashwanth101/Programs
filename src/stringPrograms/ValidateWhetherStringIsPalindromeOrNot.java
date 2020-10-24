package stringPrograms;

public class ValidateWhetherStringIsPalindromeOrNot {

	public static boolean validatePalindrome(String s) {
		
		int j = s.length() - 1;
		
        for(int i=0;i<s.length();i++){
        	
		if (s.charAt(i) != s.charAt(j)) {
			return false;
		}
		j--;
		
        }
        return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (!validatePalindrome("racecar")) {
			System.out.println("Not Palindrome");
		} else {
			System.out.println("Palindrome");
		}

	}

}
