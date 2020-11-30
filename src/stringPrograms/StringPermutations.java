package stringPrograms;

public class StringPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABC";
		StringPermutations sp = new StringPermutations();
		sp.recurse(s, 0, s.length()-1);
	}
	
	public void recurse(String str, int left, int right){
		
		if(left==right){
			System.out.println(str);
		}else{
			for(int i=left;i<=right;i++){
				String swapped = reverse(str, left, i);
				recurse(swapped, left+1, right);
			}
		}
		
	}
	
	
	public String reverse(String str, int a, int b){
		char temp;
		char[] c = str.toCharArray();
		temp = str.charAt(a);
		c[a] = c[b];
		c[b] = temp;
		
		return String.valueOf(c);
		
		
	}

}
