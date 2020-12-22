package numberPrograms;

import java.util.Arrays;

public class FindKthSmallestAndLargestNumberInAnArray {
	
	public static void KthSmallestNumber(int[]arr, int a){
		
		
		for(int i=0;i<arr.length;i++){
			
			for(int j=0;j<arr.length-1-i;j++){
				
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[a-1]);
		
		
		
		
		
	}
	
	public static void KthLargestNumber(int[]arr, int a){
		
		
		for (int i = 0; i < arr.length-1; i++) {
			
			for(int j=0;j<arr.length-1-i;j++){
				
				if (arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
				
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr[a-1]);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,5,1,6,8};
		
		KthSmallestNumber(a, 2);
		KthLargestNumber(a, 2);
		
		
		
		

	}

}
