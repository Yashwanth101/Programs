package numberPrograms;

import java.math.BigInteger;

public class FactorialCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//For Numbers less than 13
		int fact = 1;
		for(int i=1;i<=4;i++){
			fact*=i;
		}
		
		System.out.println(fact);
		
		// For Big Numbers
		/*int num = 32;
		
		BigInteger bigInteger = BigInteger.ONE;
		
		for(int i=num;i>0;i--){
			bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println(bigInteger);*/

	}

}
