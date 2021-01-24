package numberPrograms;

import java.util.Arrays;

public class FindAllSubArraysWithSumIsEqualTo_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
		
		
		for(int i=0;i<arr.length;i++){
			int sum = arr[i];
			for(int j=i+1;j<arr.length;j++){
				sum = sum+arr[j];
				if(arr[i]==0||sum==0){
					System.out.println(Arrays.toString(Arrays.copyOfRange(arr, i, j+1)));
					
				}
				
				
			}
			
		}
		
		
		
		

	}

}
