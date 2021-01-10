package numberPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
	
	
	public static void commomElementsInTwoArrays(int arr1[], int arr2[]){
		
		HashSet<Integer> se1 = (HashSet<Integer>) Arrays.stream(arr1).boxed().collect(Collectors.toSet());
		HashSet<Integer> se2 = (HashSet<Integer>) Arrays.stream(arr2).boxed().collect(Collectors.toSet());
		se1.retainAll(se2);
		System.out.println(se1);
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1[] = {1, 5, 10, 20, 40, 80};
		int a2[] = {6, 7, 20, 80, 100};
		int a3[] = {3, 4, 15, 20, 30, 70, 80};
		
		commonElements(a1,a2,a3);
		
		int b1[] = { 1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
		int b2[] = {100, 9, 64, 7, 36, 5, 16, 3, 4, 1};
		commomElementsInTwoArrays(b1,b2);
		
		
		

	}

}
