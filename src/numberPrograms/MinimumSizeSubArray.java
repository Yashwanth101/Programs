package numberPrograms;

import java.util.Arrays;

//Refer to Video -- https://www.youtube.com/watch?v=jKF9AcyBZ6E&ab_channel=NickWhite



public class MinimumSizeSubArray {
	
	public static void minSize(int s, int a[]){
		
		int temp = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++){
			int sum = 0;
			int count = 0;
			for (int j=i;j<a.length;j++){
				sum+=a[j];
				count++;
				if(sum>s){
					if(temp>count){
						temp = count;
					}
				  System.out.println(Arrays.toString(Arrays.copyOfRange(a, i, j+1)));
				  break;
				  
				}
				
			}
			
			
			
			
		}
		
		System.out.println(temp);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1, 2, 4};
		
		minSize(51, a);
		
		
		

		
	}

}
