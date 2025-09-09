package chap03;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///문구 출력
		System.out.println("점수를 입력하세요");
		
		///입력 기능을 사용하기위해 scanner 가져오기
		Scanner scanner = new Scanner(System.in);
		
		///정수를 입력받을 거기 때문에 정수형 변수 num에 입력받은 값을 넣기
		int num = scanner.nextInt();

		///검사할 값은 (num / 10) 입니다
		switch (num / 10) {
		
		///()num/10)의 값이
		case 10:
			///num을 10으로 나눴는데 몫이 10일때
			///break가 없기때문에 아래줄로 이동
		case 9:
			///num을 10으로 나눴는데 몫이 9일때
			///문구 출력
			System.out.println("A학점");
			
			///swich문을 끝낸다
			break;
		case 8:
			///num을 10으로 나눴는데 몫이 8일때
			///문구 출력
			System.out.println("B학점");
			
			///swich문을 끝낸다
			break;
		case 7:
			///num을 10으로 나눴는데 몫이 7일때
			///문구 출력
			System.out.println("C학점");
			
			///swich문을 끝낸다
			break;
		case 6:
			///num을 10으로 나눴는데 몫이 6일때
			///문구 출력
			System.out.println("D학점");
			
			///swich문을 끝낸다
			break;
		default:
			///num을 10으로 나눴는데 몫이 10,9,8.7,6이 아닐때
			///문구 출력
			System.out.println("F 학점");
			
			///swich문을 끝낸다
			break;
		}
	}

}
