package numberPrograms;

public class MaxConsecutiveOnesInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 1, 0,1,1,1 };
		int temp = 0;
		int count = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] == 1) {
				count++;
			}else{
				if(temp<count){
				temp=count;
				}
				count=0;
			}
			temp = Math.max(count, temp);

		}
		System.out.println(temp);

	}

}
