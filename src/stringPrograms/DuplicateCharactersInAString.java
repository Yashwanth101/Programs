package stringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharactersInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aabbccdef";
		char ch[] = s.toCharArray();
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
		for(Character c:ch){
			Integer count = lhm.get(c);
			if(count==null){
				lhm.put(c, 1);
			}else{
				lhm.put(c, ++count);
			}
		}
		
		//Set<Entry<Character, Integer>> set = lhm.entrySet();
		
		for(Map.Entry<Character, Integer> map : lhm.entrySet()){
			if(map.getValue()>1){
				System.out.println(map.getKey());
			}
			
		}

	}

}
