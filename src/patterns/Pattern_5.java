package patterns;

/*
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */

public class Pattern_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows = 7;
		
		for(int i=rows;i>0;i--){
			
			for(int j=1;j<=i;j++){
				
				System.out.print(j+" ");
				
			}
			
			System.out.println();
			
		}
		
	}

}
