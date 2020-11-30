package patterns;

/*
1234567
 234567
  34567
   4567
    567
     67
      7
     67
    567
   4567
  34567
 234567
1234567
 */

public class Pattern_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 7; i++) {

			// Print Spaces

			for (int j = 1; j < i; j++) {

				System.out.print(" ");

			}

			// Print Remaining Numbers

			for (int k = i; k <= 7; k++) {

				System.out.print(k);

			}

			System.out.println();

		}

		for (int i = 6; i > 0; i--) {

			// Print Spaces

			for (int j = 1; j < i; j++) {

				System.out.print(" ");

			}

			for (int k = i; k <= 7; k++) {
				System.out.print(k);
			}

			System.out.println();

		}

	}

}
