package stringPrograms;

public class SwapTwoNumbersWithOutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;

		/*a = a + b;
		b = a - b;
		a = a - b;
		
		
		// Using the third Variable
		
		int temp = a;
		a=b;
		b= temp;
		System.out.println(a);
		System.out.println(b);*/
		
		// Swap them in a Single Line
		
		a = a + b - (b = a);

	}

}
