package pyramidPrograms;

/*
         *
        * *
       * * *
      * * * *
     * * * * *
    * * * * * *
   * * * * * * *
  * * * * * * * *
 * * * * * * * * *

 */

public class Pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows = 9;
		for(int i=1;i<=rows;i++){
			
			// Print Spaces
			for(int j=1;j<=rows-i;j++){
				System.out.print(" ");
			}
			
			//Print Stars
			
			for(int k=1;k<=i;k++){
				System.out.print("*"+" ");
			}
			
			System.out.println();
			
		}

	}

}
