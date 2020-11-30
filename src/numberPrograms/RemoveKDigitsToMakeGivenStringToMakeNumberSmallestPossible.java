package numberPrograms;

//https://www.youtube.com/watch?v=vbM41Zql228&t=474s&ab_channel=NickWhite

import java.util.Stack;

public class RemoveKDigitsToMakeGivenStringToMakeNumberSmallestPossible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "10200";
		int k = 1;

		if (k == s.length())
			System.out.println("Unable to Perform Operatrionsd");

		Stack<Character> stack = new Stack<>();

		int counter = 0;
		
        // Check whether present number is greated than the coming number, if so replace that number
		while (counter < s.length()) {

			while (k > 0 && !stack.isEmpty() && stack.peek() > s.charAt(counter)) {
               stack.pop();
               k--;
			}
			stack.push(s.charAt(counter));
			counter++;
		}
		
		while(k>0){
			stack.pop();
			k--;
		}
		
		StringBuilder sb = new StringBuilder();

		while(!stack.isEmpty()){
			Character c = stack.pop();
			sb.append(c);	
		}
		
		sb.reverse();
		
		while(sb.length()>1&&sb.charAt(0)=='0'){
			sb.deleteCharAt(0);
		}
		
		String ss = sb.toString();
		
		System.out.println(ss);
		

	}

}
