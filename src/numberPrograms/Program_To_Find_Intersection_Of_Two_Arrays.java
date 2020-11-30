package numberPrograms;

import java.util.HashSet;

/*
 * First Array : [ONE, TWO, THREE, FOUR, FIVE, FOUR]
   Second Array : [THREE, FOUR, FIVE, SIX, SEVEN, FOUR]
   Common Elements : [FIVE, FOUR, THREE] 
 * 
 */

public class Program_To_Find_Intersection_Of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] a = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
		  
        String[] b = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
        
        HashSet<String> s = new HashSet<>();
        
        for (int i = 0; i < a.length; i++) {
        	
        	for (int j = 0; j < b.length; j++) {
        		
        		if(a[i]==b[j]){
        			s.add(a[i]);
        		}
				
			}
			
		}
        
        System.out.println(s);
        
        
		
		

	}

}
