package stringPrograms;



public class LongestPalindromicSubString {
	
	int resultStart = 0;
	int resultEnd = 0;
	public String longestPalindrome(String s){
		
		for(int i=0;i<s.length()-1;i++){
			
			expandRange(s, i, i);
			expandRange(s, i, i+1);
			

		}
		
		return s.substring(resultStart,resultStart+resultEnd);
		
	}
	
	
	public void expandRange(String s, int start, int end){
		
		while(start>=0&&end<s.length()&&s.charAt(start)==s.charAt(end)){
			start--;
			end++;
		}
		
		if(resultEnd<end-start-1){
			resultStart = start+1;
			resultEnd = end-start-1;
		}
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new LongestPalindromicSubString().longestPalindrome("forgeeksskeegfor"));
	
				

	}

}
