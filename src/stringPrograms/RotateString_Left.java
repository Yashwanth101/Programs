package stringPrograms;

import java.util.Arrays;

public class RotateString_Left {

	public static void reverse(char[] c, int k) {

		for (int i = 0; i < k; i++) {
			int start = 0;
			int end = 1;
			while (start < c.length - 1) {
				char temp = c[start];
				c[start] = c[end];
				c[end] = temp;
				start++;
				end++;
			}
			
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcd";
		char ch[] = s.toCharArray();
		reverse(ch, 2);
		System.out.println(Arrays.toString(ch));

	}

}
