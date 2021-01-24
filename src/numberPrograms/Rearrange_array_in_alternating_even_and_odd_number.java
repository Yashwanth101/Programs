package numberPrograms;

import java.util.Arrays;

public class Rearrange_array_in_alternating_even_and_odd_number {
	
	
	public static void rearrange(int arr[]){
		
		int index = -1, temp=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0){
				index++;
				temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		int even = index+1, odd =0;
		while(even<arr.length&&arr[odd]!=0&&odd<even){
			temp = arr[odd];
			arr[odd] = arr[even];
			arr[even] = temp;
			even++;
			odd+=2;
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {3,1,2,4};
		rearrange(a);
		

	}

}
