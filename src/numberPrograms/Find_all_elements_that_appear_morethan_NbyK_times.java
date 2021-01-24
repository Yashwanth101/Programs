package numberPrograms;

//https://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz6ggsVDmZH
// Problem -- 27

public class Find_all_elements_that_appear_morethan_NbyK_times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {3, 1, 2, 2, 1, 2, 3, 3};
		
		int k = 4;
		
		int count = a.length/k;
		
		for(int i=0;i<a.length;i++){
			int temp=1;
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					temp++;
				}
			}
			
			if(temp>count){
				System.out.println(a[i]);
			}
		}
		
		
		


		
		
		

	}

}
