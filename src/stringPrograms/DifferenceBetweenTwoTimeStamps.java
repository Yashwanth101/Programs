package stringPrograms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Stack;

public class DifferenceBetweenTwoTimeStamps {
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		/*String startDate = "23:12:46";
		String endDate = "24:12:46";
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		
		Date d1 = sdf.parse(startDate); 
        Date d2 = sdf.parse(endDate); 
        
        long diff = d2.getTime()- d1.getTime();
        System.out.println(diff);
        
        long diffHours = diff / (60 * 60 * 1000) % 24;
        long diffMin = diff/ (60*1000)%60;
        long diffSeconds = diff / 1000 % 60;
        System.out.println(diffMin);*/
		
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
