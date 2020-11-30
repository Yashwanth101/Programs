package patterns;

public class FloydsTraingle {
	static int count = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		
	    
		
		for(int i=1;i<=5;i++){
			
			for (int j=1;j<=i;j++){
				System.out.print(count+" ");
				count++;
			}
			
			System.out.println();
			
		}

	}

}
