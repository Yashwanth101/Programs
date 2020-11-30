package numberPrograms;

public class FIZZBUZZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<100;i++){
			if((i%3==0)&&(i%5==0)){
				System.out.println("FIZZBUZZ");
			}else if (i%3==0){
				System.out.println("FIZZ");
			}else if (i%5==0){
				System.out.println("BUZZ");
			}else{
				System.out.println(i);
			}
					
		}

	}

}
