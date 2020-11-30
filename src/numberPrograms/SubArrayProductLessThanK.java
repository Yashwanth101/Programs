package numberPrograms;

import java.util.Arrays;

public class SubArrayProductLessThanK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 5, 2, 6 };
		int sum = 100;

		int count = 0;

		for (int i = 0; i < a.length; i++) {
			int temp = 1;
			int c = i;
			for (int j = i; j < a.length; j++) {
				temp = (temp) * a[c];

				if (temp < sum) {
					count++;
				} else {
					break;
				}
				c++;

			}

		}
		
		System.out.println(count);

	}

}
