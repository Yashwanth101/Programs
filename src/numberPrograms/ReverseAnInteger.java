package numberPrograms;

public class ReverseAnInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 123;
		int reverse = 0;

		while (i != 0) {
			int pop = i % 10;
			i /= 10;
			reverse = (reverse * 10) + pop;

		}

		System.out.println(reverse);

	}

}
