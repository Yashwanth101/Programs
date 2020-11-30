package numberPrograms;

public class CalculateSquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// For Perfect Square
		int n = 90;
		
		/*for(int i=1;i<n;i++){
			
			if((i*i)==n){
				System.out.println("Square Root is:"+i);
				break;
			}
			
		}*/
		
		int temp;
		int sqt = n/2;
		
		do{
			temp = sqt;
			sqt = ((temp)+(n/temp))/2;
		}while((temp-sqt)!=0);
		
		System.out.println(sqt);
		

	}

}
