package numberPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindNonRepeatedElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1, 1, 2, 2, 3, 4, 4, 5, 5};
		
		// Brute Force Method
		
		for (int i = 0; i < a.length; i++) {
			boolean isNonRepeated = false;
			for (int j = 0; j < a.length; j++) {
				
				if(a[i]==a[j]&&i!=j){
					isNonRepeated = true;
				}
				
			}
			
			if(isNonRepeated==false){
				System.out.println(a[i]);
			}else{
				
			}
			
		}
		
		// Using the Collections
		
		LinkedHashMap<Integer, Integer> hmap = new LinkedHashMap<>();
		
		for(int b:a){
			Integer count = hmap.get(b);
			
			if(count==null){
				hmap.put(b, 1);
			}else{
				hmap.put(b, ++count);
			}
			
		}
		
		for(Map.Entry<Integer, Integer> mm:hmap.entrySet()){
			if(mm.getValue()==1){
				System.out.println(mm.getKey());
			}
		}
		



	}

}
