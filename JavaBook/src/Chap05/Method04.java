package Chap05;

public class Method04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		///문구 출력
		System.out.print("1부터 10의 합계 : ");
		
		///sum함수 호출
		sum();
	}

	///sum함수의 정의
	///return이 없는 void 타입
	public static void sum() {
		///sum함수가 하는일
		///0~10까지 순차적으로 더하기
		///숫자를 더할 sum 변수 선언, 값 0 할당
		int sum = 0;
		
		///for문
		///정수 i는 0이고
		///i가 10보다 작거나 같을때 까지 반복한다
		///i는 for문이 한바퀴 돌때마다 1증가한다 
		for(int i = 0; i <= 10; i++) {
			///sum변수에 i의 값을 게속 더하기
			sum += i;//sum =  sum + i; 와 같음
		}
		///sum 값 출력
		System.out.println(sum);
	}
}
