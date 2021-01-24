package numberPrograms;

import java.util.Arrays;

public class Rearrange_array_in_alternating_positive_and_negative_number {
	
	public static void rearrange(int arr[]){
		
		int n = arr.length; int temp = 0;
		
		int lesserIndex = -1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<0){
				lesserIndex++;
			    temp = arr[lesserIndex];
				arr[lesserIndex] = arr[i];
				arr[i] = temp;
			}
		}
		
		int pos = lesserIndex+1, neg = 0;
		
		while(pos<n&&neg<pos){
			temp = arr[neg];
			arr[neg] = arr[pos];
			arr[pos] = temp;
			pos++;
			neg+=2;
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9}; 
		rearrange(arr);

	}

}
