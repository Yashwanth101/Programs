package patterns;
/*
1010101
0101010
1010101
0101010
1010101
0101010
1010101
 */

public class Pattern_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		
		for(int i=1;i<=7;i++){	
			
			for(int j=1;j<=7;j++){
				
				if(num%2==0){
					System.out.print("0");
				}else{
					System.out.print("1");
				}
				
				num++;
				
			}
			
			System.out.println();
		}

	}

}
