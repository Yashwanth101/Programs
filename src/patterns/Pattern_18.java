package patterns;

/*
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
 */

public class Pattern_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows = 5;
		
		for(int i=1;i<=rows;i++){
			
			int num = i;
			
			for(int j=1;j<=i;j++){
				
				System.out.print(num+" ");
				num = num+rows-j;
				
			}
			
			System.out.println();
			
		}

	}

}
