package numberPrograms;

import java.util.Arrays;

//https://www.geeksforgeeks.org/longest-consecutive-subsequence/

/*Input: arr[] = {1, 9, 3, 10, 4, 20, 2}
Output: 4
Explanation: 
The subsequence 1, 3, 4, 2 is the longest 
subsequence of consecutive elements*/

public class Longest_Consecutive_Subsequence {
	
	
	public static void start(int a[]){
		
		Arrays.sort(a);
		
		int start=1;
		
		for(int i=0;i<a.length;i++){
			
			if(a[i]==start){
				start++;
			}else{
				break;
			}
			
			
		}
		
		System.out.println(start-1);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 9, 3, 10, 4, 20, 2};
		start(a);

	}

}
