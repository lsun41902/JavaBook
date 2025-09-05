package Chap04;

import java.util.Scanner;

public class Loop01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;//정수형 변수 sum을 선언, 값 0을 할당.
		System.out.println("5개의 숫자를 입력하세요.");//안내 문구 출력.
		
		//for문에 사용할 기본 정수형 변수 n을 선언하고 기본값 1을 선언.
		//for문이 작동하는 조건은 n이 5보다 작거나 같을때 계속 반복.
		//for문이 반복해서 동작할 수 있도록 n++ 추가. 1번의 반복문이 끝날때 마다 n이 1증가됨.
		for(int n = 1; n <= 5; n++) {
			Scanner scanner = new Scanner(System.in);//입력기능을 사용하기 위해 scanner 클래스 가져오기
			int num = scanner.nextInt();//정수를 입력 받을거기 때문에 int 타입 num 변수 선언. 값을 유저로부터 입력 받기.
			
			sum += num;//sum = sum + num; sum은 현재 0이 들어있음. 0 + num(입력받은수)
			
			//반복문 끝. n이 1 증가됨.다시 for문의 조건을 검사하러 처음으로 돌아감.
		}
		
		//반복문은 n의값이 5보다 작거나 같을때 라는 조건이 성립하지 않을때 까지 작동.
		//해당 for문은 n의 값이 6이 되면 n이 5보다 작거나 같을때가 성립하지 않음.
		//for문은 1,2,3,4,5 총 5번 작동되었음.
		//5번 작동 하면서 입력받은 수를 차곡 차곡 sum에게 더해서 추가했음.
		System.out.println("합계: "+sum);//입력받은수 5개 합계 출력
	}

}
