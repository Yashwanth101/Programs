package numberPrograms;

import java.util.ArrayList;
import java.util.List;

// https://www.youtube.com/watch?v=icoql2WKmbA&ab_channel=NickWhite

public class PascalsTriangle {
	
	public static List<List<Integer>> pascal(int num){
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		List<Integer> first = new ArrayList<>();
		first.add(1);
		result.add(first);
		
		for(int i=1;i<num;i++){
			List<Integer> previous_row = result.get(i-1);
			List<Integer> current_row = new ArrayList<>();
			
			current_row.add(1);
			for(int j=1;j<i;j++){
				current_row.add(previous_row.get(j-1)+previous_row.get(j));
			}
			current_row.add(1);
			result.add(current_row);
			
			
		}
		return result;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        List<List<Integer>> ll = pascal(5);
        for(List<Integer> l:ll){
        	System.out.println(l);
        }
	}

}
