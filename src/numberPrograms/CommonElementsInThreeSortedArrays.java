package numberPrograms;

import java.util.ArrayList;
import java.util.HashSet;

public class CommonElementsInThreeSortedArrays {
	
	public static void commonElements(int[]... multipleArrays){

		HashSet<Integer> set = new HashSet<>();
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int[] singleArray:multipleArrays){
			
			for(int singleElement:singleArray){
				
				if(set.contains(singleElement)&&!al.contains(singleElement)){
						al.add(singleElement);
					
				}else{
					set.add(singleElement);
				}
				
			}
			
		}
		
		System.out.println(al);
		
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1[] = {1, 5, 10, 20, 40, 80};
		int a2[] = {6, 7, 20, 80, 100};
		int a3[] = {3, 4, 15, 20, 30, 70, 80};
		
		commonElements(a1,a2,a3);
		
		
		

	}

}
