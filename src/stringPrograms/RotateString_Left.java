package stringPrograms;

import java.util.Arrays;

public class RotateString_Left {

	public static void rotate(char[] ch, int start, int end, int k){
		for(int i=0;i<k;i++){
		while(start<ch.length-1){
			
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			
			start++;
			end++;
		
			
		}
		
		start = 0;
		end = 1;
		
		}
		
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "GeeksforGeeks";
		char ch[] = s.toCharArray();
		rotate(ch,0,1,2);
		System.out.println(Arrays.toString(ch));

	}

}
