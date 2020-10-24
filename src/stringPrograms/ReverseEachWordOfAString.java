package stringPrograms;

public class ReverseEachWordOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String original = "Reverse Me";
		
		String[] splitOriginal = original.split(" ");
		
		for(int i=0;i<splitOriginal.length;i++){
			
			
			for(int j=splitOriginal[i].length()-1;j>=0;j--){
				
				System.out.print(splitOriginal[i].charAt(j));
				
			}
			
			System.out.print(" ");
			
		}
		
		
		

	}

}
