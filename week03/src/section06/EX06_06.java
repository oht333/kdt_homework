package section06;

public class EX06_06 {
	public static void main(String[] args) {
		int[] arr = {1,6,2,3,10,7,4,5,8,9};
		
		int temp = 0;
		
		for(int i=arr.length-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(arr[j] > arr[j+1]) {		//만약 앞의 값이 뒤의 값보다 크다면 정렬
					temp = arr[j+1];		//임시temp변수에 뒤의 값을 저장
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("정렬 후 출력 : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
