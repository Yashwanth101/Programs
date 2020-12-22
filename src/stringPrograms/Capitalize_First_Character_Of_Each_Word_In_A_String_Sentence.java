package stringPrograms;

public class Capitalize_First_Character_Of_Each_Word_In_A_String_Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "make selenium easy";
		
		String split[] = s.split(" ");
		
		for(int i=0;i<split.length;i++){
			
			String ss = split[i].substring(0,1).toUpperCase();
			
			System.out.print(ss+split[i].substring(1)+" ");
			
			
		}
		

	}

}
