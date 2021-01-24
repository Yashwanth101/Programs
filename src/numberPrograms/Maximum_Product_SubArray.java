package numberPrograms;

public class Maximum_Product_SubArray {
	
	//https://www.youtube.com/watch?v=1s0r7Ixir80&ab_channel=NickWhite

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { -2, -40, 0, -2, -3 };
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			int temp = a[i];
			for (int j = i+1; j < a.length; j++) {

				temp *= a[j];

				if (temp > count) {
					count = temp;
				}

			}

		}

		System.out.println(count);

	}

}
