
package numberPrograms;

public class Second_Largest_Element_In_An_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1,4,5,6,2 };

		// Second Largest Element In An Array
		int max = Integer.MIN_VALUE;
		int sMax = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {
				sMax = max;
				max = a[i];
			} else if (a[i] > sMax) {
				sMax = a[i];
			}

		}

		System.out.println(max);
		System.out.println(sMax);
		
		// Second Lowest Element In An Array
		
		int b[] = { 47498, 14526, 74562, 42681, 75283, 45796 };
		
		int min = Integer.MAX_VALUE;
		int sMin = Integer.MAX_VALUE;
		
		for(int i=0;i<b.length;i++){
			
			if(b[i]<min){
				sMin = min;
				min = b[i];
				
			}else if(b[i]<sMin){
				sMin = b[i];
			}
			
		}
		
		System.out.println(min);
		System.out.println(sMin);
		
		

	}

}
