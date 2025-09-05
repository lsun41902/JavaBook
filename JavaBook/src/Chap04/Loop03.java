package Chap04;

import java.util.Scanner;

public class Loop03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);//입력 기능을 위한 scanner 클래스 가져오기

		System.out.println("10보다 큰 숫자를 입력하세요");
		int x = s.nextInt();//정수형 x 변수를 선언하고, 유저의 입력을 받은 값으로 할당.
		int sum = 0;//정수형 sum 변수 선언, 기본 값 0 할당.

		//처음 실행할 작업 처리
		//예시 입력 11
		do {
			sum += x;// sum = sum + x; 현재 sum의 값은 0 이고 x의 값은 11로 입력받았기 때문에, 0 + 11 이 됨.  
			x--;//x는 다음줄 부터는 1 감소
		} while (x >= 10);//while문의 조건 검사. 1이 감소된 10 >= 10; 10은 10보다 크거나 같아? 라는 조건이 성립하기에 true, 다시 do를 한바퀴 돔기.
		
		System.out.println("합계: " + sum);
	}

}
