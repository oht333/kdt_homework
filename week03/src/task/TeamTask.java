package task;

import java.util.Scanner;

public class TeamTask {
	public static void main(String[] args) {
//		1번 문제 
//		사용자에게 각 국어, 수학, 역사의 점수를 입력받는다
//		입력받은 3개의 과목의 총합점수와 소수점 2번째 자리 까지 평균을 구해라	
//		
//		//1) Scanner import
//		//2) 각각 영역에 점수를 입력
//		//3) 총합, 평균 계산
//		//4) 결과출력
//		Scanner sc = new Scanner(System.in);
//		
//		// 점수 입력
//        System.out.print("국어 점수를 입력하세요: ");
//        int korean = sc.nextInt();
//
//        System.out.print("수학 점수를 입력하세요: ");
//        int math = sc.nextInt();
//
//        System.out.print("역사 점수를 입력하세요: ");
//        int history = sc.nextInt();
//
//        // 총합 계산
//        int total = korean + math + history;
//
//        // 평균 계산 (소수점 둘째 자리까지 출력)
//        double average = total / 3.0;
//
//        // 결과 출력
//        System.out.println("\n총합 점수: " + total);
//        System.out.printf("평균 점수: %.2f\n", average);
//
//        sc.close();
		
////		사칙연산 실행
////		조건
////		1차원 2칸짜리 배열 생성
////		사용자로부터 입력 받고(int형) 배열에 저장(for문으로 저장)
////		메소드4개(더하기, 빼기, 곱하기, 나누기)
////		리턴타입 O, 매개변수 O (매개변수는 배열로 전달)
////		-> 더하기 메소드(for-each문 사용)
////		-> 빼기 메소드(큰값 - 작은값)
////		-> 곱하기 메소드(원하시는 대로)
////		-> 나누기 메소드(실수형으로 형변환. 0번 인덱스/1번 인덱스.
////		0으론 나눌 수 없음.)
//		
//		//1)Scanner import
//		//2)2칸짜리 배열 선언
//		//3)정수 2개 입력하라는 출력문
//		//4)for문을 통해 배열 차례대로 입력
//		
//        Scanner scanner = new Scanner(System.in);
//        int[] numbers = new int[2];
//
//        System.out.println("정수 2개를 입력하세요:");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print((i + 1) + "번째 정수 입력: ");
//            numbers[i] = scanner.nextInt();
//        }
//
//        // 9)결과 출력
//        System.out.println("\n사칙연산 결과:");
//        System.out.println("더하기: " + add(numbers));
//        System.out.println("빼기: " + subtract(numbers));
//        System.out.println("곱하기: " + multiply(numbers));
//        System.out.println("나누기: " + divide(numbers));
//
//        scanner.close();
//		
//	}
//		
//		//5) add메소드 (for-each 문)
//    public static int add(int[] nums) {
//        int sum = 0;
//        for (int num : nums) {
//            sum += num;
//        }
//        return sum;
//    }
//    	//6) 빼기 메소드(최대값, 최소값 구하기)
//    public static int subtract(int[] nums) {
//    	int max = Math.max(nums[0], nums[1]);
//        int min = Math.min(nums[0], nums[1]);
//        return max - min;
//    }
//
//    	//7) 곱하기 메소드
//    public static int multiply(int[] nums) {
//        return nums[0] * nums[1];
//    }
//
//    	//8) 나누기 메소드
//    public static double divide(int[] nums) {
//        double result = (double) nums[0] / nums[1];
//        return result; 
//    }
	}
}
