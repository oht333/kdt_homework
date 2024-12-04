package section08;

public class Calc3 {
	public int sum(int[] nums) {
		int result = 0;
		for(int i=0; i<nums.length; i++) {
			result += nums[i];
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int nums[] = {500,200};
		Calc3 calc = new Calc3();
		System.out.println("숫자들의 합은 " + calc.sum(nums) + "입니다.");	//매서드의 리턴값은 숫자로 나오기 때문에 출력문안에서 사용할 수 있다.
	}

}
