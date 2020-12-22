package stringPrograms;

import java.util.Arrays;

public class RemoveSpacesWithOutUsingTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "  Make Selenium Easy  ";
		int startIndex = 0;
		int lastIndex = 0;
		char[] charray = str.toCharArray();
		
		System.out.println(Arrays.toString(charray));
		System.out.println(charray.length);
		
		
		for(int i=0;i<str.length();i++){
			
			if(charray[i]!=' '){
				startIndex = i;
				break;
			}
			
		}
		
		for(int j=str.length()-1;j>=0;j--){
			
			if(charray[j]!=' '){
				lastIndex = j;
				break;
			}
			
		}
		
	
		System.out.println(str.substring(startIndex, lastIndex+1));

	}

}
