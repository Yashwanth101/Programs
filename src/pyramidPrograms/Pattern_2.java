package pyramidPrograms;

/*
         1
        1 2
       1 2 3
      1 2 3 4
     1 2 3 4 5
    1 2 3 4 5 6
   1 2 3 4 5 6 7
  1 2 3 4 5 6 7 8
 1 2 3 4 5 6 7 8 9
 */

public class Pattern_2 {

	public static void main(String[] args){
	
	    int rows = 9;
	
	    for(int i=1;i<=rows;i++){
	    	
	    	//Print Spaces
	    	
	    	for(int j=1;j<=rows-i;j++){
	    		System.out.print(" ");
	    	}
	    	
	    	// Print Numbers
	    	
	    	for(int k=1;k<=i;k++){
	    		System.out.print(k+" ");
	    	}
	    	
	    	System.out.println();
	    	
	    }
	    
	    
		
	}

}
