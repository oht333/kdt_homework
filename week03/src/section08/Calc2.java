package section08;

public class Calc2 {
	void sum(int[] nums) {
		int result = 0;
		for(int i=0; i<nums.length; i++) {		//for문을 통해 각 배열들을 반복하고
			result += nums[i];					//배열들의 값을 result에 계속 더한다
		}
		
		System.out.println("숫자들의 합은 " + result + "입니다.");
	}
	
	public static void main(String[] args) {
		int nums[] = {100,200};
		Calc2 calc = new Calc2();
		calc.sum(nums);		//배열nums를 매서드 인수로 지정한다
	}

}
