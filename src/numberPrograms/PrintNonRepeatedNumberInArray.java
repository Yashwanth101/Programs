package numberPrograms;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class PrintNonRepeatedNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3, 2, 4 };

		LinkedHashMap<Integer, Integer> hmap = new LinkedHashMap<>();
		for (Integer i : a) {
			Integer count = hmap.get(i);

			if (count == null) {
				hmap.put(i, 1);
			} else {
				hmap.put(i, ++count);
			}

		}
		 

		for (Map.Entry<Integer, Integer> m : hmap.entrySet()) {
			if (m.getValue() == 1) {
				System.out.println(m.getKey());
			}
		}

		// Brute Force Solution

		for (int i = 0; i < a.length; i++) {
			int count = 0;

			for (int j = 0; j < a.length; j++) {

				if (i != j && a[i] == a[j]) {

					count++;
					break;

				}

			}

			if (count == 0) {
				System.out.println(a[i]);
			}

		}

	}
}
