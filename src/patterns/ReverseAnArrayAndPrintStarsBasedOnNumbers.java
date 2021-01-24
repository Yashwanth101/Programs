package patterns;

/*
[4, 3, 2, 1]
$$$$321
$$$$$$$21
$$$$$$$$$1
$$$$$$$$$$
 */

import java.util.Arrays;

public class ReverseAnArrayAndPrintStarsBasedOnNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = {1,2,3,4};
		
		int reversed[] = new int[a.length];
		
		int j = 0;
		
		for(int i=a.length-1;i>=0;i--){
			reversed[j] = a[i];
			j++;
		}
		
		
		
		System.out.println(Arrays.toString(reversed));
		
		
		for(int i=0;i<reversed.length;i++){
			
			int sum = 0;
			
			for(int k=0;k<=i;k++){
				sum+=reversed[k];
			}
			
			for(int l=1;l<=sum;l++){
				System.out.print("$");
			}
			
			for(int h = i+1;h<reversed.length;h++){
				System.out.print(reversed[h]);
			}
			
			System.out.println();
			
		}
		

	}

}
