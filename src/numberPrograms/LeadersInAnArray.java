package numberPrograms;

import java.util.LinkedHashMap;

// The Numbers after the current number should be less than the current number

import java.util.Map;

public class LeadersInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {8, 23, 19, 21, 15, 6, 11};
	
		
		for(int i=0;i<a.length;i++){
			boolean isLeader = true;
			for(int j=i+1;j<a.length;j++){
				
				if(!(a[i]>a[j])){
					isLeader = false;
					break;
				}
				
			}
			
			if(isLeader){
				System.out.println(a[i]);
			}
			
			
			
		}


	}

}
