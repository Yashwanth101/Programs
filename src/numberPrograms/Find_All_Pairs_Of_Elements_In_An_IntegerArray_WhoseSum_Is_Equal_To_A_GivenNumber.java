package numberPrograms;

public class Find_All_Pairs_Of_Elements_In_An_IntegerArray_WhoseSum_Is_Equal_To_A_GivenNumber {

	public static void main(String[] args) {

		int a[] = { 4, -5, 9, 11, 25, 13, 12, 8 };
		int value = 20;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] + a[j] == value) {
					System.out.println(a[i] + " + " + a[j] + " = " + value);
				}

			}

		}

	}

}
