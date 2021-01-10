package stringPrograms;

public class ExtractNumbersFromStringAndAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "ABCabc12345!@";
		
		String onlyNumbers = s.replaceAll("\\D","");
		
		int sum = 0;
		
		
		for(int i=0;i<onlyNumbers.toCharArray().length;i++){
			
			sum+=Integer.parseInt(String.valueOf(onlyNumbers.charAt(i)));
			
		}
		
		System.out.println(sum);
		
		
		

	}

}
