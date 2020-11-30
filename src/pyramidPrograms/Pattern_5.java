package pyramidPrograms;

/*
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
    1 2 3 4 5 6 7 6 5 4 3 2 1
      1 2 3 4 5 6 5 4 3 2 1
        1 2 3 4 5 4 3 2 1
          1 2 3 4 3 2 1
            1 2 3 2 1
              1 2 1
                1
 */

public class Pattern_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows = 10;
		int spaces = 0;
		int forward = 0;

		for(int i=1;i<=10;i++){
			
			// Print Spaces
			
			for(int k=0;k<(spaces*2);k++){
				System.out.print(" ");
			}
			
			// Print Forward Numbers
			
			for(int j=1;j<=rows-forward;j++){
				System.out.print(j+" ");
			}
			
			// Print Backward Numbers
			
			for(int l=rows-i;l>0;l--){
				System.out.print(l+" ");
			}
			
			System.out.println();
			spaces++;
			forward++;
			
			
			
		}
		
	}

}
