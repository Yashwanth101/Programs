package numberPrograms;

import java.util.HashSet;

public class PrintDuplicateDataInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = {1,2,4,2,4};
		
		//Brute Force Method
		
		/*for(int i=0;i<a.length;i++){
			
			for(int j=i+1;j<a.length;j++){
				
				if(a[i]==a[j]&&i!=j){
					System.out.println(a[j]);
				}
				
			}
			
		}*/
		
		
		// Using HashSet
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0;i<a.length;i++){
			
			if(set.contains(a[i])){
				System.out.println("Duplicate Is: "+a[i]);
			}else{
				set.add(a[i]);
			}
			
		}
		

	}

}
