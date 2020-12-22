package stringPrograms;

public class JavaProgramToFindLengthOfTheStringWithOutUsingLengthMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Yashwanth";


		// Method 1 -- Convert to Char and find length
		int count = 0;
		for(char c:s.toCharArray()){
			count++;
		}
		
		System.out.println(count);
		
		// Metthod 2 -- Using the lastIndexOf Method
		
		System.out.println(s.lastIndexOf(""));
		

	}

}
