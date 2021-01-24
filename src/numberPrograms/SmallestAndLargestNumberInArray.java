package numberPrograms;

public class SmallestAndLargestNumberInArray {
	
	
	public static void smallestAndLargestNumber(int a[]){
		
		int max = a[0];
		int min = a[0];
		
		for(int n:a){
			if(n>max){
				max = n;
			}else if(n<min){
				min = n;
			}
		}
		
		System.out.println(max);
		System.out.println(min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		smallestAndLargestNumber(new int[]{-20, 34, 21, -87, 92,
                100});

	}

}
