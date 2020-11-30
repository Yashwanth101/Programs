package numberPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/*
 *   Add an whole array1 to the Array List and then compare in the 
 *   elements in the array2 with the array1, if array2 elements are 
 *   not found in the array1 then add the element to the ArrayList.
 *   Then compare the elements in the array3 with the arrayList, If 
 *   not found then add the element to the arrayList.
 */

public class Union_Of_Multiple_Arrays {

	static ArrayList<Integer> unionOfArrays(Integer[] integers, int arr2[], int arr3[]) {

		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(integers));
		
		for (int i = 0; i < arr2.length; i++) {
			boolean isUnion = false;
			for (int j = 0; j < integers.length; j++) {

				if (arr2[i] == integers[j]) {
					isUnion = true;
					break;
				}

			}

			if (!isUnion) {
				al.add(arr2[i]);
			}
			
		}
		
		for(int i=0;i<arr3.length;i++){
			boolean isUnion = false;
			for(int j=0;j<al.size();j++){
				
				if(arr3[i]==al.get(j)){
					
					isUnion = true;
					break;
				}
				
			}
			
			if (!isUnion) {
				al.add(arr3[i]);
			}
			
		}
		
		

		return al;
	}
	
	static void union_Using_Collections(int[]... inputArrays){
		
		HashSet<Integer> hashSet = new HashSet<>();
		
		for(int[] singleArray:inputArrays){
			
			for(int singleElement:singleArray){
				
				hashSet.add(singleElement);
				
			}
			
		}
		
		System.out.println(hashSet);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Brute Force Method....
		System.out.println(unionOfArrays(new Integer[] {1,2,4},new int[] {3,4,5,6}, new int[] {3,4,7,8}));
		
		//Using Collections class
		union_Using_Collections(new int[] {1,2,4},new int[] {3,4,5,6}, new int[] {3,4,7,8}, new int[] {9,10,3,11});
		

	}

}
