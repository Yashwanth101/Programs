package numberPrograms;

/*
 * Step 1 : First we find out sum of ‘n’ numbers by using formula n*(n+1)/2.

   Step 2 : Then we will find sum of all elements of array ‘a’.

   Step 3 : Missing_Number = (Sum of 1 to ‘n’ numbers) – (Sum of elements of array ‘a’)
 */

public class Find_A_Missing_Number_In_An_Integer_Array_Between_N_Numbers {

	static int sum = 0;

	static int sumOfnumbers(int n) {

		return (n * (n + 1)) / 2;

	}

	static int sumOfNumbersInAnArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static int finalVal(int[] a){
		int x;
		
		if((x = sumOfnumbers(8)- sumOfNumbersInAnArray(a))!=0){
			return x;
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 4, 5, 3, 2, 8, 6 };

		System.out.println(finalVal(a));

	/*	int b[] = { 1, 3, 4, 5, 6, 7, 10 };

		int count = 1;

		for (int j = 0; j < b.length; j++) {

			if (b[j] != count) {
				System.out.println(count);
				count++;
				j--;
			}else{
				count++;
			}
			

		}
*/
	}

}
