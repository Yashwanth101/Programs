package stringPrograms;

import java.util.HashSet;

public class NumberOfVowelsAndConstantsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Yashwanth123!@#";
	
		
		int vowels = 0, constants=0;
		
		char[] ch = s.trim().toLowerCase().replaceAll("[^a-zA-Z]", "").toCharArray();
		
		for(int i=0;i<ch.length;i++){
			
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
				vowels++;
			}else{
				constants++;
			}
			
		}
		
		System.out.println("Vowels Count: "+vowels+" Constants Count: "+constants);
		
		
		
		// Print String by removing the vowels
		
		String str = "Yashwanth";
		StringBuilder sb = new StringBuilder();
		
		HashSet<Character> set = new HashSet<>();
		set.add('a');
		set.add('e');
		set.add('i');
		set.add('o');
		set.add('u');
		set.add('A');
		set.add('E');
		set.add('I');
		set.add('O');
		set.add('U');
		
		
		for(int i=0;i<str.length();i++){
			
			if(!set.contains(str.charAt(i))){
				sb.append(str.charAt(i));
			}
			
		}
		
		System.out.println(sb);
		
	
		

	}

}
