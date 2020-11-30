package pyramidPrograms;

/*
         1
        2 2
       3 3 3
      4 4 4 4
     5 5 5 5 5
    6 6 6 6 6 6
   7 7 7 7 7 7 7
  8 8 8 8 8 8 8 8
 9 9 9 9 9 9 9 9 9
 */

public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows = 9;
		for(int i=1;i<=rows;i++){
			
			//Print Spaces
			
			for(int j=1;j<rows-i;j++){	
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++){
				System.out.print(i+" ");
			}
			
			System.out.println();
			
			
		}

	}

}
