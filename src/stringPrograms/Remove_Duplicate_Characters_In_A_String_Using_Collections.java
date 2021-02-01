package stringPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class Remove_Duplicate_Characters_In_A_String_Using_Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//RemoveDuplicateCharactersInAString using_Collections
		
		String str = "bananas";
		String s[] = str.split("");
		HashSet<String> set = new HashSet<>(Arrays.asList(s));
		String ss = set.toString();
		System.out.println(ss);
		
		
		/*char ch[] = str.toCharArray();
		HashSet<Character> set = new HashSet<>();
		StringBuilder sb = new StringBuilder(); 
		for(Character c:ch){
			if(!set.contains(c)){
			set.add(c);
			sb.append(c);
			}
		}
		System.out.println(sb.toString());*/
		
	
		
		

	}

}
