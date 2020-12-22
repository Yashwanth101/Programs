package stringPrograms;

import java.util.Arrays;

public class RotateString_Left {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "GeeksforGeeks";
		char ch[] = s.toCharArray();
		
		int index  = 2;
		for(int i=index;i<ch.length;i++){
			System.out.print(ch[i]+" ");
		}
		for(int j=0;j<index;j++){
			System.out.print(ch[j]+" ");
		}
		
		
		
		

	}

}
