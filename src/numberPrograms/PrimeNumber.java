package numberPrograms;

//Print Prime Numbers between 1 to 100

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 2; i < 100; i++) {
			boolean isPrime = false;
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					isPrime = true;
					break;
				}

			}

			if (!isPrime) {
				System.out.println(i);
			}

		}

	}

}
