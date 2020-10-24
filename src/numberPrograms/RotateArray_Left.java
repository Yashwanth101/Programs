package numberPrograms;

import java.util.Arrays;

public class RotateArray_Left {

	public void reverse(int[] a, int start, int end, int k) {

		for (int i = 0; i < k; i++) {
			while (start < a.length - 1) {
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
				start++;
				end++;
			}

			start = 0;
			end = 1;

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { -1, -100, 3, 99 };
		RotateArray_Left r = new RotateArray_Left();
		r.reverse(a, 0, 1, 2);
		System.out.println(Arrays.toString(a));

	}

}
