package numberPrograms;

import java.util.HashSet;

public class CommonElementsInTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] a1 = {"a", "b", "c", "d", "e", "f"};
		String[] a2 = {"b", "d", "e", "h", "g", "c"};
		
		
		HashSet<String> set = new HashSet<>();
		
		for(int i=0;i<a1.length;i++){
			for(int j=0;j<a2.length;j++){
				if(a1[i]==a2[j]){
					set.add(a1[i]);
				}
			}
		}
		
		System.out.println(set);
		

	}

}
