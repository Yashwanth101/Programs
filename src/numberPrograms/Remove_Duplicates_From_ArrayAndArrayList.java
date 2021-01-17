package numberPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Remove_Duplicates_From_ArrayAndArrayList {
	
public static HashMap<Integer, String> sortByValue(HashMap<Integer, String> hm){
		
		List<Map.Entry<Integer, String>> list = new LinkedList<>(hm.entrySet());
		Collections.sort(list,new Comparator<Map.Entry<Integer, String>>() {
			
			public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2){
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		
		// Add new map and update it with the sorted map
		
		LinkedHashMap<Integer, String> temp = new LinkedHashMap<>();
		
		for(Map.Entry<Integer, String> tt:list){
			temp.put(tt.getKey(), tt.getValue());
		}
		
		return temp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Remove nulls from Array
		
		String a[] = {"java","java","c++","c#", null, null};
		
		a = Arrays.stream(a).distinct().filter(Objects::nonNull).toArray(String[]::new);
		
		System.out.println(Arrays.toString(a));
		
		// Remove duplicates from the ArrayList
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Java");
		al.add("py");
		al.add("c++");
		al.add("Java");
		al.add("c++");
		al.add(null);
		al.add(null);
		
		
		al = (ArrayList<String>) al.stream().distinct().filter(Objects::nonNull).collect(Collectors.toList());
		
		
		System.out.println(al);
		
		Map<Integer, String> hm1 = sortByValue(map2); 
		for (Map.Entry<Integer, String> en : hm1.entrySet()) { 
	        System.out.println("Key = " + en.getKey() +  
	                      ", Value = " + en.getValue()); 
	    }

	}

}
