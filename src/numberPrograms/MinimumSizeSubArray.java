package numberPrograms;

//Refer to Video -- https://www.youtube.com/watch?v=jKF9AcyBZ6E&ab_channel=NickWhite



public class MinimumSizeSubArray {
	
	public static int minSize(int s, int a[]){
		int sum = 7;
		int total_count = 0;
		int result = Integer.MAX_VALUE;
		int left = 0;
		
		for(int i=0;i<a.length;i++){
			total_count+=a[i];
			
			while(total_count>=sum){
				result = Math.min(result, i+1-left);
				total_count -= a[left];
				left++;	
			}
		}
		return (result!=Integer.MAX_VALUE)?result:0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2,3,1,2,4,3};
		
		int b = minSize(7, a);
		System.out.println(b);
		
		

		
	}

}
