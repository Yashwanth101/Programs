package stringPrograms;

public class Make_CapitalLetter_ToSmall_And_ViceVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String s = "mAkE SeleNIUM eaSY";
		
		StringBuilder sb = new StringBuilder();
		
		
		for(char c:s.toCharArray()){
			
			int index = (int)c;
			
			if(index>=65 && index<=90){
				sb.append(String.valueOf(c).toLowerCase());
			}else if (index>=97 && index<=122){
				sb.append(String.valueOf(c).toUpperCase());
			}else{
				sb.append(" ");
			}
			
		}
		
		System.out.println(sb);

	}

}
