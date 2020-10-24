package stringPrograms;

public class ConvertStringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Method -1
		String s = "+123";
		int i = Integer.parseInt(s);
		System.out.println(i);
		
		//Method -2 
		String s2 = "234";
		int i2 = Integer.valueOf(s2);
		System.out.println(i2);
		
		
		//Convert Integer to the String
		
		int i3 = 123;
		String s3 = String.valueOf(i3);
		System.out.println(s3);
				

	}

}
