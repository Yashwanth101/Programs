package numberPrograms;

import java.util.Arrays;

public class Move_Zeros_To_End_Of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 12, 0, 7, 0, 8, 0, 3 };

		int counter = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] != 0) {
				a[counter] = a[i];
				counter++;
			}

		}

		System.out.println(counter);
		System.out.println(a.length);

		while (counter < a.length) {
			a[counter] = 0;
			counter++;
		}
		System.out.println(Arrays.toString(a));
		
	}

}
