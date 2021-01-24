package numberPrograms;

import java.util.Arrays;

public class Rearrange_Array_LowestNumber_Followed_By_Highest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = {5, 8, 1, 4, 2, 9, 3, 7, 6};
		
		int temp[] = new int[a.length];
		
		Arrays.sort(a);
		
		int arrIndex = 0;
		
		for(int i=0,j=a.length-1;i<=a.length/2||j>a.length/2;i++,j--){
		    	
			if(arrIndex<a.length){
				temp[arrIndex] = a[i];
				arrIndex++;
			}
			
			if(arrIndex<a.length){
				temp[arrIndex] = a[j];
				arrIndex++;
			}
			
		}
		
		System.out.println(Arrays.toString(temp));

	}

}
