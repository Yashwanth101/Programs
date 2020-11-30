package numberPrograms;

public class PivotProblem {
	
	/*
	 * 
	 * Input: nums = [1,7,3,6,5,6]
       Output: 3
       Explanation:
       The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers to the right of index 3.
       Also, 3 is the first index where this occurs.
       
       URL -- https://leetcode.com/problems/find-pivot-index/	
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,7,3,6,5,6};
		int sum = 0;
		for(int x:a)sum+=x;
		int left_side = 0;
		for(int i=0;i<a.length;i++){
			if(left_side == sum-left_side-a[i]) System.out.println(a[i]);
			left_side+=a[i];
		}
		
		
		

	}

}
