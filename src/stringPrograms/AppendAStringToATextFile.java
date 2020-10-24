package stringPrograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendAStringToATextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String s = "YKGroup";
		
		BufferedWriter br = new BufferedWriter(new FileWriter("G:\\Job_Selenium\\StringPrograms\\New Text Document.txt",true));
		br.write(s);
		br.close();
		

	}

}
