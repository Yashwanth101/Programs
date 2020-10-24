package stringPrograms;

import java.util.Arrays;

public class RotateString_Right {

	public static void rotate(char[] c, int k) {
		rotateString(c, 0, c.length - 1);
		rotateString(c, 0, k - 1);
		rotateString(c, k, c.length - 1);

	}

	public static void rotateString(char[] c, int start, int end) {

		while (start < end) {
			char temp = c[start];
			c[start] = c[end];
			c[end] = temp;
			start++;
			end--;

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcd";
		char ch[] = s.toCharArray();
		rotate(ch, 2);
		System.out.println(Arrays.toString(ch));

	}

}
