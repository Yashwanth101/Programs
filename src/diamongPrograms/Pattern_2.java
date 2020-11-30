package diamongPrograms;
/*
   1
  2 2
 3 3 3
4 4 4 4
 3 3 3
  2 2
   1
 */

public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 8;
		
		int numCount = 1;
		
		int midPoint = num/2;
		
		for(int i=1;i<=midPoint;i++){
			
			//Print Spaces
			for(int j=i;j<=midPoint;j++){
				System.out.print(" ");
			}
			
		    // Print Numbers
			for(int k=1;k<=i;k++){
				System.out.print(numCount+" ");
			}
			
			System.out.println();
			numCount++;
			
		}
		
		//SecondHalf
		
		for(int i=0;i<=midPoint;i++){
			
			//Print Spaces
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			
			//Print Numbers
			for(int k=numCount;k>0;k--){
				System.out.print(numCount+" ");
			}
			
			System.out.println();
			numCount--;
			
			
		}

	}

}
