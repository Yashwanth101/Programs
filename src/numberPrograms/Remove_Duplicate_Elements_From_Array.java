package numberPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class Remove_Duplicate_Elements_From_Array {
	
	static void removeDuplicates(int[] arrayWithDuplicates)
    {
        System.out.println("Array With Duplicates : "+Arrays.toString(arrayWithDuplicates));
          
        //Assuming all elements in input array are unique
          
        int noOfUniqueElements = arrayWithDuplicates.length;
          
        //Comparing each element with all other elements
          
        for(int i=0;i<noOfUniqueElements;i++){
        	
        	for(int j=i+1;j<noOfUniqueElements;j++){
        		
        		if(arrayWithDuplicates[i]==arrayWithDuplicates[j]){
        			
        			arrayWithDuplicates[j] = arrayWithDuplicates[noOfUniqueElements-1];
        			
        			noOfUniqueElements--;
        			
        			j--;
        			
        		}
        		
        	}
        	
        	
        }
          
        //Copying only unique elements of arrayWithDuplicates into arrayWithoutDuplicates
          
        int[] arrayWithoutDuplicates = Arrays.copyOf(arrayWithDuplicates, noOfUniqueElements);
          
        //Printing arrayWithoutDuplicates
          
        System.out.println("Array Without Duplicates : "+Arrays.toString(arrayWithoutDuplicates));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		//Method to Completely Remove elements from an Array
		
		/*int[] a = { 4, 3, 2, 4, 9, 2 };

		int temp[] = new int[a.length];

		int count = 0;

		for (int i = 0; i < a.length; i++) {

			boolean isDuplicate = false;

			for (int j = 0; j < a.length; j++) {

				if (a[i] == a[j] && i != j) {

					isDuplicate = true;
					break;

				}

			}

			if (!isDuplicate) {
				temp[count++] = a[i];
			}

		}*/
		
		
		//Using Collections
		
		/*HashSet<Integer> s = new HashSet<>();
		for(int i=0;i<a.length;i++){
			s.add(a[i]);
		}
		
		System.out.println(s);*/
		
		 removeDuplicates(new int[] {4, 3, 2, 4, 9, 2});
		

	}

}
