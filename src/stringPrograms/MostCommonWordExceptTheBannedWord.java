package stringPrograms;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class MostCommonWordExceptTheBannedWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * YouTube Description Of the Problem =
		 * https://www.youtube.com/watch?v=qbEtfHjAI8A&list=
		 * PLU_sdQYzUj2keVENTP0a5rdykRSgg9Wp-&index=99&ab_channel=NickWhite
		 * Problem Number -- 99
		 */

		String s = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String banned_word = "banned";

		LinkedHashMap<String, Integer> hmap = new LinkedHashMap<>();

		for (String sp : s.split(" ")) {

			Integer count = hmap.get(sp);

			if (!(sp.equalsIgnoreCase(banned_word))) {

				if (count == null) {

					hmap.put(sp, 1);

				} else {

					hmap.put(sp, ++count);

				}

			}

		}

		System.out.println(hmap);

		LinkedList<Integer> ll = new LinkedList<>(hmap.values());

		Collections.sort(ll);

		for (Map.Entry<String, Integer> m : hmap.entrySet()) {

			if (m.getValue() == ll.getLast()) {
				System.out.println("Most Repeated Word: " + m.getKey());
			}

		}

	}

}
