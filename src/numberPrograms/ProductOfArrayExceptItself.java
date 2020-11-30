package numberPrograms;

import java.util.Arrays;
// Print product of other numbers except itself
/*
Input = { 1, 2, 3, 4 };

Output= [24, 12, 8, 6]*/

public class ProductOfArrayExceptItself {
	
	// Print the Sum of Numbers in an Array except itself...

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		int a[] = { 1, 2, 3, 4 };
		
		int b[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			int temp = 1;
			for (int j = 0; j < a.length; j++) {

				if (i != j) {
					temp *= a[j];
				}

			}
			b[i] = temp;
			

		}
		
		System.out.println(Arrays.toString(b));

	}

}
