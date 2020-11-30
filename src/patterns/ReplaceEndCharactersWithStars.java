package patterns;

import java.util.Arrays;

/*
Input = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1}
output should be
1234**4321
123****321
12******21
1********1
**********
*/

public class ReplaceEndCharactersWithStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
		
		int midPoint = a.length/2;
		
		int b[] = new int[midPoint];
		
		int c[] = new int[midPoint];
		
		int x= 0;
		
		for(int i=0;i<midPoint;i++){
			b[i] = a[i];
		}
		
		for(int i=midPoint;i<=a.length-1;i++){
			c[x] = a[i];
			x++;
		}
		
		int y = 1;
		
		int startPoint = 0;
		int endPoint = b.length-1;
		
		for(int i=0;i<midPoint;i++){
			
			for(int j=0;j<endPoint;j++){
				System.out.print(a[j]);
			}
			
			for(int j=endPoint;j<b.length;j++){
				System.out.print("*");
			}
			
			endPoint--;
			
			for(int j=0;j<=startPoint;j++){
				System.out.print("*");
			}
			
			for(int j=y;j<c.length;j++){
				System.out.print(c[j]);
			}
			
			startPoint++;
			y++;
			
			System.out.println();
			
			
		}

	}

}
