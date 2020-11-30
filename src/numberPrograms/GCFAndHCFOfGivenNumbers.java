package numberPrograms;

import java.util.Collections;
import java.util.LinkedList;

public class GCFAndHCFOfGivenNumbers {
	
	//GCF and HCF Are the Same

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int num1 = 55, num2 = 121;

        while (num1 != num2) {
        	if(num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }

        System.out.printf("GCD of given numbers is: %d", num2);*/
		
		int num1 = 18, num2 = 24; int num3 = 36;
		
		int maxNumber = Math.max(Math.max(num1, num2),num3);
		
		LinkedList<Integer> ll = new LinkedList<>();
		
		for(int i=1;i<maxNumber;i++){
			
			if(num1%i==0&&num2%i==0&&num3%i==0){
				ll.add(i);
			}
			
		}
		
		Collections.sort(ll);
		
		System.out.println(ll.getLast());
		

	}

}
