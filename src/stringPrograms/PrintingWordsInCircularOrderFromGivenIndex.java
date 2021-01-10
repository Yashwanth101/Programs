package stringPrograms;

/*
 * 
    Suppose you have below string:

    “Make Selenium Easy” Where

      -“Make” is at position zero.
      -“Selenium” is at first position .
      -“Easy” is at second position .

	If I say:
	
	-zero, You need to print “Make Selenium Easy”.
	-one, you need to print “Selenium Easy Make”.
	-two, you need to print “Easy Selenium Make”.
 */

public class PrintingWordsInCircularOrderFromGivenIndex {
	
	
	public static void rotateStringClockwise(){
		
        String s = "Make Selenium Easy";
		
		String arr[] = s.split(" ");
		
		int index = 2;
		
		for(int i=index;i<arr.length;i++){
			
			System.out.print(arr[i]+" ");
			
		}
		
		for(int k=0;k<index;k++){
			System.out.print(arr[k]+" ");
		}
		
	}
	
	public static void rotateAntiClockwise(){
		
        String s = "Make Selenium Easy";
		
		String arr[] = s.split(" ");
		
		int index = 1;
		
		for(int i=index;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
		
		for(int k=index+1;k<arr.length;k++){
			System.out.print(arr[k]+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		rotateAntiClockwise();
		
		
		
		
		

	}

}
