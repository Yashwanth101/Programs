package numberPrograms;

public class Third_Largest_Element_In_An_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = { 5,1,4,3,6 };
		
		int max = Integer.MIN_VALUE;
		int sMax = Integer.MIN_VALUE;
		int tMax = Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++){			
			if(a[i]>max){
				tMax = sMax;
				sMax = max;
				max = a[i];
			}else if (a[i]>sMax){
				tMax = sMax;
				sMax = a[i];
			}else if (a[i]>tMax){
				tMax = a[i];
			}	
		}
		
		System.out.println(max);
		System.out.println(sMax);
		System.out.println(tMax);
		
		// Third Min Number in An Array
		
		int min = Integer.MAX_VALUE;
		int sMin = Integer.MAX_VALUE;
		int tMin = Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++){			
			if(a[i]<min){
				tMin = sMin;
				sMin = min;
				min = a[i];
			}else if (a[i]<sMin){
				tMin = sMin;
				sMin = a[i];
			}else if (a[i]<tMax){
				tMin = a[i];
			}	
		}
		
		System.out.println(min);
		System.out.println(sMin);
		System.out.println(tMin);
		

	}

}
