package numberPrograms;

import java.util.Arrays;

public class SumOfNumbersToLeftIsEqualToSumInRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 7, 2, 5, 4, 1 };
		int Lsum = 0;
		int Rsum = 0;
		int[] left = new int[a.length];
		int[] right = new int[a.length];

		for (int i = 0; i < a.length; i++) {

			if (i == 0) {

				for (int j = 1; j < a.length; j++) {
					Rsum += a[j];
				}

				if (a[i] == Rsum) {
					left = Arrays.copyOfRange(a, i, 1);
					right = Arrays.copyOfRange(a, 1, a.length);
					break;
				}
				
				
			} else {
				Lsum = 0;
				Rsum = 0;

				for (int k = i + 1; k < a.length; k++)
					Rsum += a[k];
				for (int h = i; h >= 0; h--)
					Lsum += a[h];

				if (Lsum == Rsum) {
					left = Arrays.copyOfRange(a, 0, i+1);
					right = Arrays.copyOfRange(a, i+1, a.length);
					break;
				}
			}

		}

		System.out.println(Arrays.toString(left));
		System.out.println(Arrays.toString(right));

	}

}
