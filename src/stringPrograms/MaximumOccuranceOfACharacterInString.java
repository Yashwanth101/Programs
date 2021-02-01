package stringPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MaximumOccuranceOfACharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//How to find the maximum occurring character in given String? _ With Collection
		
		String s = "aabbbccccbbcccccde";
		char[] ch = s.toCharArray();
		LinkedHashMap<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		//char[] ch = s.toCharArray();
		for(Character c:ch){
			Integer io = m.get(c);
			if (io==null) {
				//Option 1 to display the Min and Max Repeated character
				m.put(c, 1);
			}else{
				m.put(c, ++io);
			}
		}
		
		System.out.println(m);
		
		
		List<Integer> ll = new ArrayList<Integer>(m.values());
		ll = (ArrayList<Integer>) (ll.stream().distinct().sorted().collect(Collectors.toList()));
		System.out.println(ll);
		int Smin = ll.get(1);
		int max = ll.get(ll.size()-1);
		
		
		
		
		for(Map.Entry<Character, Integer> l:m.entrySet()){
			if(l.getValue()==max){
				System.out.println("Repeated Character: "+l.getKey()+"------"+"Times it was repeated: "+l.getValue());
			}
		}
		
		// Minimum Occurance Of a character
		
		for(Map.Entry<Character, Integer> l1:m.entrySet()){
			if(l1.getValue()==Smin){
				System.out.println("Least Repeated:"+l1.getKey());
			}
		}
		
		
		
		
		//How to find the maximum occurring character in given String? _ Without Collection 
		
		/*int max1 = 0;
		int temp =0;
		char ch2 = ' ';
		
		for(int i=0;i<ch.length;i++){
			
			for(int j=i+1;j<ch.length-1;j++){
				
				if(ch[i]==ch[j]){
					temp++;
				}
				if(temp>max1){
					max1 = temp;
					ch2 = ch[i];
				}
				
			}
			temp=0;
			
		}
		System.out.println(ch2);*/
			
		
		
		
		
		
		
		
		

				

	}

}
