package stringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Print the count of the Alphabets present in the String 
 * Ex - Given String  -- aabbbbbcccdde
 * Output = 2a5b3c2d1e
 * 
 * 
 */

public class Print_Sum_Of_Characters_As_A_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aabbbbbcccdde";
		
		//Method - 1
		
		while(s.length()>=1){
			
			char c = s.charAt(0);
			
			int count = 0;
			
			for(int i=0;i<s.length();i++){
				
				if(c==s.charAt(i)){
					count++;
				}
				
			}
			
			System.out.print(String.valueOf(count)+String.valueOf(c));
			s= s.replaceAll(String.valueOf(c), "");
			
			
		}
		
		
		//Method - 2
		
		/*LinkedHashMap<Character, Integer> hmap = new LinkedHashMap<>();
		
		for(Character c:s.toCharArray()){
			Integer count = hmap.get(c);
			
			if(count==null){
				hmap.put(c, 1);
			}else{
				hmap.put(c, ++count);
			}
			
		}
		
		System.out.println(hmap);
		
		for(Map.Entry<Character, Integer> map:hmap.entrySet()){
			System.out.print(map.getValue()+""+map.getKey());
		}*/

	}

}
