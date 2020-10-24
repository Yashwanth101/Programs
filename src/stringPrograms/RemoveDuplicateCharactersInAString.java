package stringPrograms;

import java.util.HashSet;

public class RemoveDuplicateCharactersInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//RemoveDuplicateCharactersInAString using_Collections
		
		String str = "bananas";
		char ch[] = str.toCharArray();
		HashSet<Character> set = new HashSet<>();
		StringBuilder sb = new StringBuilder(); 
		for(Character c:ch){
			if(!set.contains(c)){
			set.add(c);
			sb.append(c);
			}
		}
		System.out.println(sb.toString());
		
		
		//RemoveDuplicateCharactersInAString without using_Collections
		
		/*String str = "bananas";
		boolean repeatedChar;
		char ch1[] = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<ch1.length;i++){
			repeatedChar = false;
			for(int j=i+1;j<ch1.length-1;j++){
				if(ch1[i]==ch1[j]){
					repeatedChar = true;
		            break;
				}
				
			}
			if (!repeatedChar) {
		        sb.append(ch1[i]);
		    }
		}
		System.out.println(sb);
		*/
		

	}

}
