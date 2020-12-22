package numberPrograms;

import java.util.Arrays;

public class RotateArray_Left {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1,2,3,4,5 };
		
		
		int index = 2;
		
		
		for(int i=index;i<a.length;i++){
			System.out.print(a[i]+" ");
		}

		for(int i=0;i<index;i++){
			System.out.print(a[i]+" ");
		}
		

	}

}
