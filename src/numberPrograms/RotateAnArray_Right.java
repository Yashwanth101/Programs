package numberPrograms;

import java.util.Arrays;

public class RotateAnArray_Right {
	
	public void rotate(int []a, int k){
		//k %= a.length;
		reverse(a, 0, a.length-1);
		reverse(a, 0, k-1);
		reverse(a, k, a.length-1);
	}
	
	public void reverse(int[] nums, int start, int end){
		while(start<end){
		int temp = nums[start];
		nums[start] = nums[end];
		nums[end] = temp;
		start++;
		end--;
	}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[] = {1,2,3,4,5};
		RotateAnArray_Right r = new RotateAnArray_Right();
		r.rotate(a, 4);
		System.out.println(Arrays.toString(a));
		
		
		
		

	}

}
