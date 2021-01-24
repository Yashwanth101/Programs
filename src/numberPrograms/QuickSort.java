package numberPrograms;

import java.util.Arrays;

//https://www.youtube.com/watch?v=QN9hnmAgmOc&ab_channel=Jenny%27slecturesCS%2FITNET%26JRF

public class QuickSort {
	
	
	public void partition(int a[], int low, int high){
		
		int mid = low+(high-low)/2;
		
		int pivot = a[mid];
		int i = low;
		int j = high;
		
		
		
		while(i<=j){
			
			while(a[i]<pivot)
				i++;
			while(a[j]>pivot)
			    j--;
			if(i<=j){
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
			
		}
		
		
		if(low<j){
			System.out.println(low +" "+j);
			partition(a, low, j);
		}
		
		if(high>i){
			
			System.out.println(high+" "+i);
			partition(a, i, high);
		}
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {7,6,10,5,9,2,1,15,7};
		new QuickSort().partition(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
		
		

	}

}
