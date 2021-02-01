package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class SortAnIntegerAndStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Integer Array
		
		// Natural Order [Acending Order] 
		
		int a[] = {1,10,5,8,2,4};
		
		a = Arrays.stream(a).sorted().toArray();
		
		System.out.println(Arrays.toString(a));
		
		
		// Decending Order
		
		Integer b[] = {1,10,5,8,2,4};
		
		b = Arrays.stream(b).sorted(Collections.reverseOrder()).toArray(Integer[]::new);
		System.out.println(Arrays.toString(b));
		
		
		
		

	}

}
