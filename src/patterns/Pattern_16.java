package patterns;

/*
1111111
1111122
1111333
1114444
1155555
1666666
7777777
 */

public class Pattern_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=7;i++){
			
			//Print 1s
			
			for(int j=1;j<=7-i;j++){
				System.out.print("1");
			}
			
			for(int k=1;k<=i;k++){
				System.out.print(i);
			}
			
			System.out.println();
			
		}

	}

}
