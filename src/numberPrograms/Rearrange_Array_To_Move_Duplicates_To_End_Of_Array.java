package numberPrograms;

import java.util.Arrays;

public class Rearrange_Array_To_Move_Duplicates_To_End_Of_Array {

	public static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void startExe(int a[]) {

		int arrayLength = a.length - 1;

		for (int i = 0; i < arrayLength; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {

					swap(a, i, arrayLength);
					arrayLength--;

					break;
				}

			}

		}

		System.out.println(Arrays.toString(a));
		System.out.println(arrayLength);
	}

	public static void main(String[] array) {

		int a[] = { 1, 2, 3, 4, 5, 2, 3 };

		Arrays.sort(a);

		startExe(a);

	}

}
