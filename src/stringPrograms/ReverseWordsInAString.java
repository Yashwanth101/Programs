package stringPrograms;

import java.util.Arrays;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Java is best";
		String str[] = s.split(" ");
		
		for(int i=str.length-1;i>=0;i--){
			System.out.print(str[i]+" ");
		}
		

	}

}
