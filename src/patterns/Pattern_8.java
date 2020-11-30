package patterns;

/*
7 6 5 4 3 2 1
6 5 4 3 2 1
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
 */

public class Pattern_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows = 7;
		
		for(int i=rows;i>0;i--){
			
			for(int j=i;j>=1;j--){
				
				System.out.print(j+" ");
				
			}
			
			System.out.println();
			
		}

	}

}
