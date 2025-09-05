package Chap04;

import java.util.Scanner;

public class Loop02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);//입력을 위한 스캐너 클래스 가져오기
		int choice = 1;//정수형 choice 변수 선언, 기본값으로 1 할당
		
		//while choice의 값이 1일때 무한으로 작동되는 반복문. 기본choice를 1로 시작했기 때문에 처음에는 무조건 true.
		while(choice == 1) {
			int a;
			System.out.println("숫자를 입력하세요.");//안내 문구 출력
			a = s.nextInt();//유저로부터 값을 입력 받기를 대기

			//입력받은 a값을 2로 나누고 나머지가 0이라면 if문을 통해 짝수 출력, 0이 아니라면 else문을 통해 홀수 출력.
			if( a % 2 == 0) {
				System.out.println("짝수 입니다.");
			}else {
				System.out.println("홀수 입니다.");
			}

			//짝수, 홀수 검사 기능을 종료하고 싶은지 유저에게 확인.
			System.out.println("계속하고 싶다면 예 1, 그만하고 싶다면 아니요 0을 입력하세요.");
			choice = s.nextInt();//입력받은 choice의 값이 변경되며 while문을 종료할지 계속할지 체크가 가능.
		}
		System.out.println("모든 숫자를 확인했습니다.");
	}

}
