package numberPrograms;

public class SubArray_with_maximum_SUM_AND_PRODUCT_in_an_array {
	
	public static void max(int[] a){
		int temp=0;
		for(int i=0;i<a.length;i++){
			int sum = a[i];
			for(int j=i+1;j<a.length;j++){
				sum+=a[j];
				if(temp<sum){
					temp=sum;
				}
			}
		}
		
		System.out.println(temp);
		
	}
	
	public static void mul(int[] a){
		
		int temp=0;
		for(int i=0;i<a.length;i++){
			int sum = a[i];
			for(int j=i+1;j<a.length;j++){
				sum*=a[j];
				if(temp<sum){
					temp=sum;
				}
			}
		}
		
		System.out.println(temp);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		max(a);
		
		int b[] = {2,3,-2,4};
		mul(b);

	}

}
