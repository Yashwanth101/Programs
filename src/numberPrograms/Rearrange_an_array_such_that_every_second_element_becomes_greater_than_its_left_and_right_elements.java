package numberPrograms;

import java.util.Arrays;

/*Given an integer array, rearrange it such that every second element
becomes greater than its left and right elements.
Assume no duplicate elements are present in the array.*/

public class Rearrange_an_array_such_that_every_second_element_becomes_greater_than_its_left_and_right_elements {

	public static void sort(int a[], int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void startExecution(int a[]){
		
		for(int i=1;i<a.length;i+=2){
			
			if(a[i-1]>a[i]){
				sort(a, i-1, i);
			}
			
			if(i+1<a.length&&a[i+1]>a[i]){
				sort(a, i+1, i);
			}
			
			
		}
		
		System.out.println(Arrays.toString(a));
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = {1, 2, 3, 4, 5, 6, 7};
		
		
		startExecution(a);
		

	}

}
