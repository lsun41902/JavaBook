package chap03;

import java.util.Scanner;

public class if02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///문구 출력
		System.out.println("숫자를 입력하세요.");

		///입력 기능을 사용하기 위한 scanner 가져오기
		Scanner s = new Scanner(System.in);
		
		///입력 받은 숫자를 받기위해 num이라는 정수형 변수 선언, 입력한 숫자 값 할당
		int num = s.nextInt();

		///num / 2 를 했을때, num을 2로 나눴을때 나머지 값이 0입니까?
		if (num % 2 == 0) {
			///num을 2로 나눴을때 나머지 값이 0 이라면
			System.out.println(num + "은 짝수입니다.");
		} else {
			///num을 2로 나눴을때 나머지 값이 0 이 아닌 그외 값일 때
			System.out.println(num + "은 홀수입니다.");
		}

		///문구 출력
		System.out.println("이 문장은 if문 외부에 있습니다.");
	}

}
