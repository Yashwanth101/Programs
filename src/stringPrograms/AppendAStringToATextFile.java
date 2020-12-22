package stringPrograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class AppendAStringToATextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*String s = "YKGroup";
		
		BufferedWriter br = new BufferedWriter(new FileWriter("G:\\Job_Selenium\\StringPrograms\\New Text Document.txt",true));
		br.write(s);
		br.close();*/
		

		int a[]={10,10,20,10,40,20,30,30,30,30};
		
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int iteration:a){
			
			Integer count = map.get(iteration);
			if(count==null){
				map.put(iteration, 1);
			}
			else{
				map.put(iteration, ++count);
			}
			
			
		}
		
		for(Entry<Integer, Integer> fm:map.entrySet()){
			
			if(fm.getValue()>1){
				
				if(fm.getValue()%2==0){
					System.out.println("Couple value is"+fm.getValue()/2);
				}
				else{
					int OddValue;
					OddValue = fm.getValue()-1;
					System.out.println("Couple value is"+OddValue/2);
				}
			
		

			}

}
		
	}
}
