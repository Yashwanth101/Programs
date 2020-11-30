package diamongPrograms;

/*
   * 
  * * 
 * * * 
* * * * 
 * * * 
  * * 
   * 
 */

public class Pattern_1 {

	public static void startExecution(int num) {

		int space = num - 1;
		int count = 1;

		// Print the Spaces

		for (int i = 0; i < num; i++) {
			
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}

			// Print Upper Half of the Diamond

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
			space--;	
		}
		
		space=num;
		
		for(int i=num;i>0;i--){
			
			//Print Spaces
			
			for(int j=i;j<space;j++){
				System.out.print(" ");
			}
			
			//Print Stars
			for(int k=1;k<=i;k++){
				System.out.print("* ");
			}
			System.out.println();
			
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		startExecution(5);

	}

}
