package stringPrograms;

import java.util.Arrays;

public class RotateString_Right {

	public static void rotate(char[] a, int k) {
      swap(a, 0, a.length-1);
      swap(a, 0, k-1);
      swap(a,k,a.length-1);
	}

	public static void swap(char[] c, int a, int b){
		
		while(a<b){
		   char temp = c[a];
		   c[a] = c[b];
		   c[b] = temp;
		   a++;
		   b--;
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "GeeksforGeeks";
		char ch[] = s.toCharArray();
		rotate(ch, 2);
		System.out.println(Arrays.toString(ch));

	}

}
