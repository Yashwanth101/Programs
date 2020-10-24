package stringPrograms;

public class RemoveCharactersFromFirstStringWhichArePresentInSecondString {

	public static void main(String[] args) {
		
		String s1 = "india is great";
		           
		String s2 = "in";
		
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<c2.length;i++){		
			for(int j=0;j<c1.length;j++){
				
				if(c2[i]==c1[j]){
					c1[j]='x';
				}			
			}
		}
		
		for(int k=0;k<c1.length;k++){
			if(!(c1[k]=='x')){
				sb.append(c1[k]);
			}
		}
		System.out.println(sb);
		
		
		
		
		
		
		
	}

}
