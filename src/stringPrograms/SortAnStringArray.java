package stringPrograms;

import java.util.Arrays;

public class SortAnStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s[] = {"Abi","Bob","Abc","Cac"};
		
		
		for(int i=0;i<s.length-1;i++){
			for(int j=0;j<s.length-1-i;j++){
				if(s[j].compareTo(s[j+1])>0){
					String temp = s[j];
					s[j] = s[j+1];
					s[j+1]= temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(s));
		
		

	}

}
