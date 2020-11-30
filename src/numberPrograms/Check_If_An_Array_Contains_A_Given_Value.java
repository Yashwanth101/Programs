package numberPrograms;

public class Check_If_An_Array_Contains_A_Given_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] myArray = {55, 45, 69, 44};
	      int num = 555;
	      boolean isNumberPresent = false;
	      
	      for(int i=0;i<myArray.length;i++){
	    	  
	    	  if(myArray[i]==num){
	    		  isNumberPresent = true;
	    		  
	    	  }
	    	  
	      }
	      
	      if(isNumberPresent){
	    	  System.out.println("Number Present");
	      }else{
	    	  System.out.println("Number not Present");
	      }

	}

}
