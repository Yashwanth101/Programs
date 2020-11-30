package patterns;

/*
1 2 3 4 5 6 7
 2 3 4 5 6 7
  3 4 5 6 7
   4 5 6 7
    5 6 7
     6 7
      7
     6 7
    5 6 7
   4 5 6 7
  3 4 5 6 7
 2 3 4 5 6 7
1 2 3 4 5 6 7
 */

public class Pattern_13 {
	
	public static void main(String[] args){
		
		for(int i=1;i<=7;i++){
			
			//Print Spaces
			
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			
			//Print Numbers
			
			for(int k=i;k<=7;k++){
				System.out.print(k+" ");
			}
			
			System.out.println();
			
		}
		
		for(int i=6;i>0;i--){
			
			// Print Spaces
			
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			
			// Print Numbers
			
			for(int k=i;k<=7;k++){
				System.out.print(k+" ");
			}
			
			System.out.println();
		}
		
	}

}
