package patterns;

/*
0000000
0100000
0020000
0003000
0000400
0000050
0000006
 */

public class Pattern_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<7;i++){
			
			for(int j=0;j<7;j++){
				
				if(i==j){
					System.out.print(i);
				}else{
					System.out.print("0");
				}
				
			}
			System.out.println();
			
		}

	}

}
