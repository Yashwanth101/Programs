package numberPrograms;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class LargestAndSmallestNumberInAnArray {
	
	//Smallest Number in an Array
	public static void smallestNumber(int a[]){
		
		int min = a[0];
		
		for(int i=0;i<a.length;i++){
			if(a[i]<min){
				min = a[i];
			}
		}
		System.out.println(min);
		
	}
	
	public static void LargestNumber(int a[]){
		int max = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max){
				max=a[i];
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,4,-6,-7,6};
		smallestNumber(a);
		LargestNumber(a);
		
		
		
		

	}

}
