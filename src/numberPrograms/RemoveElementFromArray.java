package numberPrograms;

import java.util.Arrays;

public class RemoveElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5};
		int[] afterRemovedElement = new int[arr.length-1];
		
		for(int i=0,k=0;i<arr.length;i++){
			if(i!=2){
				afterRemovedElement[k] = arr[i];
				k++;
			}
		}
		
		System.out.println(Arrays.toString(afterRemovedElement));
		

	}

}
