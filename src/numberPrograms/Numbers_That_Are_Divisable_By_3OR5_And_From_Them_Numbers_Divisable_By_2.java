package numberPrograms;

public class Numbers_That_Are_Divisable_By_3OR5_And_From_Them_Numbers_Divisable_By_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = 10;
		int sum = 0;
		
		for(int i=1;i<=10;i++){
			
			if((i%3==0)||(i%5==0)){
				
				if(i%2!=0){
					sum+=i;
				}
				
			}
			
		}
		
		System.out.println(sum);

	}

}
