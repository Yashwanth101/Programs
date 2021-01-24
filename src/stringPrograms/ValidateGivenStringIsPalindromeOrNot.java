package stringPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class ValidateGivenStringIsPalindromeOrNot {
	
	// Method 1

	public static boolean validatePalindrome(String str) {

		String temp = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			temp += str.charAt(i);

		}
		
		if(str.equalsIgnoreCase(temp)) return true ; return false;

	}
	
	// Method -2
	
	public static boolean valPalindrome(String str){
		
		Stack<Character> stack= new Stack<>();
		Queue<Character> queue = new LinkedList<Character>();
		
		for(int i=0;i<str.length();i++){
			stack.push(str.charAt(i));
			queue.add(str.charAt(i));
		}
		
		System.out.println(stack.size());
		
		for(int i=0;i<str.length();i++){
			
			if(stack.pop()!=queue.poll()){
			  return false;	
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (valPalindrome("wow")){
			System.out.println("Its Palindrome"); 
		}else{
			System.out.println("Not Palindrome");;
		}
		
		
		
		
		

	}

}
