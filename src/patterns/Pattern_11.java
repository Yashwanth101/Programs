package patterns;

/*
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
6 5 4 3 2 1
7 6 5 4 3 2 1
 */

public class Pattern_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=7;i++){
			
			for(int j=i;j>0;j--){
				
				System.out.print(j+" ");
			}
			
			System.out.println();
			
		}

	}

}
