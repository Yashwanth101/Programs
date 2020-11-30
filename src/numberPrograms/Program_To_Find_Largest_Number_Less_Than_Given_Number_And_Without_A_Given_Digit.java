package numberPrograms;

public class Program_To_Find_Largest_Number_Less_Than_Given_Number_And_Without_A_Given_Digit {

	public static int number(int num, int a){
		
		char c = (char)a;
		
		for(int i=num-1;i>0;i--){
			
			if(Integer.toString(i).indexOf(c)==-1){
				return i;
				
			}
			
		}
		
		return -1;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
