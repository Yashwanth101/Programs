package patterns;

/*
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
 */

public class Pattern_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows = 15;
		int mid = rows / 2;
		int limit = 8;

		for (int i = mid+1; i > 1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j + " ");

			}
			
			System.out.println();

		}
		
		for(int i=1;i<=limit;i++){
			
			for(int j=1;j<=i;j++){
				
				System.out.print(j+" ");
				
			}
			
			System.out.println();
			
		}

	}

}
