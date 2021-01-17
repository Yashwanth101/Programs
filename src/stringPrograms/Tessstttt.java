package stringPrograms;

public class Tessstttt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Replace Space with %20
		String str = "Java is Great";
		System.out.println(str.replaceAll("\\s", "%20"));
		
		
		// Toggle Each word in Java
		
		String s = "this is javatpoint";
		
		for(String s1:s.split(" ")){
			
			String reverse = "";
			
			for(int i=s1.length()-1;i>=0;i--){
				reverse+=s1.charAt(i);
			}
			
			String first = reverse.substring(0,1);
			String remaining = reverse.substring(1);
			
			System.out.print(first+remaining.toUpperCase()+" ");
		}
		
		

	}

}
