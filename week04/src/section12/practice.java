package section12;

import java.util.Arrays;

public class practice {
	public static void main(String[] args) {
		
		for(int i=0; i<9; i++) {
			for(int j=1; j<5-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<(2*i)-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		int[] arr = {1,6,2,3,10,7,4,5,8,9};
		
		System.out.println(Arrays.toString(arr));
		
		int temp = 0;
		
		for(int i=arr.length-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("결과 : ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		
	}
}
