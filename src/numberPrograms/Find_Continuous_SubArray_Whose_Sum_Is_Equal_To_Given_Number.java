package numberPrograms;

import java.util.Arrays;

public class Find_Continuous_SubArray_Whose_Sum_Is_Equal_To_Given_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 5, 4, 1, 2, 3, 4, 1, 4, 5, 5 };

		int target = 10;
		int count = 0;

		for (int i = 0; i < a.length; i++) {

			int sum = 0;

			for (int j = i; j < a.length; j++) {

				sum += a[j];

				if (sum == target) {
					System.out.println(Arrays.toString(Arrays.copyOfRange(a, i, j + 1)));
					count++;
				}

			}

		}

		System.out.println(count);

	}

}
