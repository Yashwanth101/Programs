package numberPrograms;

import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = {1,10,3,5,7,9};
		
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));

	}

}
