package numberPrograms;

import java.util.HashMap;
import java.util.Map;

/*
 * Input: nums = [2,7,11,15], target = 9
   Output: [0,1]
   Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 */

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10,20,30,40,50};
		
		//Brute Force Method
		
		int target = 50;
		
		for(int i=0;i<a.length;i++){
			
			for(int j=i+1;j<a.length;j++){
				
				if(a[j]==target-a[i]){
					System.out.println(a[i]+" "+a[j]);
				}
				
			}
			
		}
		
		// Using Collections
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<a.length;i++){
			
			map.put(a[i], i);
		}
		
		for(int i=0;i<a.length;i++){
			
			if(map.containsKey(target-a[i])&&map.get(target-a[i])!=i){
			   System.out.println(i+" "+map.get(target-a[i]) );
			}
			
		}

	}

}
