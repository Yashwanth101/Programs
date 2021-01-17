package numberPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;




public class Testtt {
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String s = "Yashwanth";
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
		
		
		for(int i=0;i<s.length();i++){
			
			if(!set.contains(s.charAt(i))){
				sb.append(s.charAt(i));
			}
			
		}
		
		System.out.println(sb);
		
		
		int a[] = {2, 6, 3, 9, 11};
		
		int k = 9;
		
		for(int i=0;i<a.length;i++){
			
			for(int j=0;j<a.length;j++){
				
				if(a[i]+a[j]==k){
					System.out.println(a[i]+","+a[j]);
				}
				
			}
			
		}
		
		
		
		

	}
	
}
