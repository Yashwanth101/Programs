package stringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class CheckIfAGivenStringContainsValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "()[]{} { ]";
		
		LinkedHashMap<String, Integer> hmap = new LinkedHashMap<>();
		
		int a=0,b=0,d=0;
		
		for(Character c:s.toCharArray()){
			
			if(c=='('||c==')'){
				hmap.put("()",++a);
			}else if (c=='['||c==']') {
				hmap.put("[]",++b);
			}else if(c=='{'||c=='}'){
				hmap.put("{}",++d);
			}
			
		}
		
		boolean isValid = false;
		for(Map.Entry<String, Integer> map:hmap.entrySet()){
			
			if (map.getValue()%2!=0) {
				
				System.out.println("Invalid Paranthasis are: "+map.getKey());
				isValid = true;
			}
			
		}
		
		if(isValid){
			System.out.println("Given String is not a Valid Parenthasis");
		}else{
			System.out.println("Given String is a Valid Parenthasis");
		}
		
		

	}

}
