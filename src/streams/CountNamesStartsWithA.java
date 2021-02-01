package streams;

import java.util.ArrayList;

public class CountNamesStartsWithA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Abi");
		al.add("Bib");
		al.add("cat");
		al.add("Anu");
		al.add("aki");
		
		Long count = al.stream().filter(s->s.toLowerCase().startsWith("a")).count();
		System.out.println(count);
		
		
		// Print all the names in the List
		
		al.stream().forEach(s->System.out.println(s.toUpperCase()));
		

	}

}
