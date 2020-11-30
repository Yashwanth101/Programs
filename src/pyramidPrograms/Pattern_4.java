package pyramidPrograms;

/*
                  1
                1 2 1
              1 2 3 2 1
            1 2 3 4 3 2 1
          1 2 3 4 5 4 3 2 1
        1 2 3 4 5 6 5 4 3 2 1
      1 2 3 4 5 6 7 6 5 4 3 2 1
    1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
 */

public class Pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 9;
		
		int spaces = 0;
		
		for(int i=1;i<=rows;i++){
			
			//Print Spaces
			
			for(int j=1;j<(rows*2)-spaces;j++){
				System.out.print(" ");
			}
			
			// Print Numbers from forward
			
			for(int k=1;k<=i;k++){
				System.out.print(k+" ");
			}
			
			// Print Numbers from Backward
			
			for(int l=i-1;l>0;l--){
				System.out.print(l+" ");
			}
			
			System.out.println();
			spaces+=2;
		}
		
		
		

	}

}
