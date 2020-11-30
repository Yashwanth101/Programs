package stringPrograms;

public class NumberOfVowelsAndConstantsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Yashwanth123!@#";
	
		
		int vowels = 0, constants=0;
		
		char[] ch = s.trim().toLowerCase().replaceAll("[^a-zA-Z]", "").toCharArray();
		
		for(int i=0;i<ch.length;i++){
			
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
				vowels++;
			}else{
				constants++;
			}
			
		}
		
		System.out.println("Vowels Count: "+vowels+" Constants Count: "+constants);
		
	
		

	}

}
