package stringPrograms;

public class ValidateGivenStringIsPalindromeOrNot {

	public static boolean validatePalindrome(String str) {

		String temp = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			temp += str.charAt(i);

		}
		
		if(str.equalsIgnoreCase(temp)) return true ; return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (validatePalindrome("1212")){
			System.out.println("Its Palindrome"); 
		}else{
			System.out.println("Not Palindrome");;
		}

	}

}
