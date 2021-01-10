package stringPrograms;

public class Program_to_Remove_Duplicate_Characters_From_Word_Without_Using_Collection_Concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "banancas".toLowerCase();
		StringBuilder sb = new StringBuilder();

		while (s.length() >= 1) {

			char c = s.charAt(0);

			int count = 0;

			for (int i = 1; i < s.length(); i++) {

				if (c == s.charAt(i)) {
					sb.append(c);
					count++;
					s = s.replace(String.valueOf(c), "");	
					break;
				}	

			}
			
			if (count == 0)
				sb.append(c);
			    s = s.replace(String.valueOf(c), "");	

		}

		System.out.println(sb);

	}

}
