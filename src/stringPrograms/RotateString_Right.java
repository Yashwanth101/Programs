package stringPrograms;

import java.util.Arrays;

public class RotateString_Right {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "GeeksforGeeks";
	
		char ch[] = s.toCharArray();
		int index = 2;
		
		for(int i=ch.length-index;i<ch.length;i++){
			System.out.print(ch[i]+" ");
		}
		
		for(int k=0;k<ch.length-index;k++){
			System.out.print(ch[k]+" ");
		}
		

	}

}
