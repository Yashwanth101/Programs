package stringPrograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

public class MostRepeatedWordInATextFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(
				new FileReader("G:\\Job_Selenium\\StringPrograms\\New Text Document_1.txt"));

		String line = null;
		String word = "";

		while ((line = br.readLine()) != null) {
			if(!line.isEmpty()){
			word += line;
			}
		}

		String words[] = word.split(" ");
		LinkedHashMap<String, Integer> hmap = new LinkedHashMap<>();

		for (String w : words) {
			Integer count = hmap.get(w);
			   if (!w.isEmpty()) {
				   if (count == null) {
						hmap.put(w, 1);
					} else {
						hmap.put(w, ++count);
					}
				
			}
				
		}

		System.out.println(hmap);

		LinkedList<Integer> ll = new LinkedList<>(hmap.values());

		Collections.sort(ll);

		for (Map.Entry<String, Integer> m : hmap.entrySet()) {

			if (m.getValue() == ll.getFirst()) {

				System.out.println("Least Value:" + m.getKey());

			} else if (m.getValue() == ll.getLast()) {

				System.out.println("Highest Value:" + m.getKey());
			}

		}

	}

}
