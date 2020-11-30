package numberPrograms;

public class PrintNumberWithOutUsingLoops {
	
	
	public static void printNumber(int num){
		
		if(num<100){
			System.out.println(num);
			printNumber(num+1);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=1;
		printNumber(n);
		
	}

}
