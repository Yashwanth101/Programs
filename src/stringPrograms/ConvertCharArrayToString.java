package stringPrograms;

import java.nio.channels.NetworkChannel;

public class ConvertCharArrayToString {
	
	
	// Method -1 -- Using the String Class
	
	public String toString(char a[]){
		String s = new String(a);
		return s;
	}
	
	// Method -2 -- Using String Builder
	
	public String usingBuilder(char a[]){
		StringBuilder builder = new StringBuilder();
		
		for(int i=0;i<a.length;i++){
			builder.append(a[i]);
		}
		
		return builder.toString();
	}
	
	// Method -1 -- USing valueOf Method
	
	public String valueOfMethod(char a[]){
		return String.valueOf(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 char s[] = { 'g', 'e', 'e', 'k', 
                 's', 'f', 'o', 'r', 
                 'g', 'e', 'e', 'k', 's' }; 
		 
		 System.out.println(new ConvertCharArrayToString().toString(s));
		 System.out.println(new ConvertCharArrayToString().usingBuilder(s));
		 System.out.println(new ConvertCharArrayToString().valueOfMethod(s));

	}

}
