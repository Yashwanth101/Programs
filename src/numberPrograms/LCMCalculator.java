package numberPrograms;

import java.util.Collections;
import java.util.LinkedList;

//Refer the URL --- https://www.calculator.net/lcm-calculator.html

public class LCMCalculator {
	
	public static int GCFCalculator(int num1, int num2){
		int max = Math.max(num1, num2);
		LinkedList<Integer> ll = new LinkedList<>();
		
		for(int i=1;i<=max;i++){
			if(num1%i==0&&num2%i==0){
				ll.add(i);
			}
		}
		
		Collections.sort(ll);
		return ll.getLast();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 330; int num2 = 75; int num3 = 450;
		
		int GCF = GCFCalculator(num1, num2);
		System.out.println(GCF);
		int LCM = (num1*num2)/GCF;
		int GCF_1 =GCFCalculator(LCM,num3);
		int LCM_1 = (LCM*num3)/GCF_1;
		System.out.println(LCM_1);
		
		

		
		
		
	}

}
