package numberPrograms;

import java.util.Arrays;

public class MoveAllEvenNumbersToRightAndOddNumbersToLeftOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 2, 5, 6, 8,9 ,10};
		
		//Method -1
		/*
		int b[] = new int[a.length];

		int start = 0;
		int end = a.length-1;
		for(int i=0;i<a.length;i++){
			
			if(a[i]%2==0){
				b[start] = a[i];
				start++;
			}else{
				b[end] = a[i];
				end--;
			}
			
		}
		
		System.out.println(Arrays.toString(b));*/
		 
		//Method --2

		int i = 0;
		int j = a.length-1;
		
		while(i<j){
			
			if(a[i]%2>a[j]%2){
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			
			if (a[i]%2==0) i++;
			if (a[j]%2==1) j--;
		}
		System.out.println(Arrays.toString(a));
		
		
		
	}

}
