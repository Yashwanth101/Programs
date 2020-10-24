package stringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstRepeatedAndNonRepeatedCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "Jbavaab";
		char ch[] = str.toCharArray();
		LinkedHashMap<Character, Integer> hmap = new LinkedHashMap<>();
		
		for(Character c:ch){
			Integer count = hmap.get(c);
			if(count==null){
				hmap.put(c, 1);
			}else{
				hmap.put(c, ++count);
			}
		}
		System.out.println(hmap);
		
		for(Map.Entry<Character, Integer> m:hmap.entrySet()){
			if(m.getValue()==1){
				System.out.println(m.getKey());
				break;
			}
		}
		
		for(Map.Entry<Character, Integer> m:hmap.entrySet()){
			if(m.getValue()!=1){
				System.out.println(m.getKey());
				break;
			}
		}
		

	}

}
