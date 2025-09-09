package Chap05;

public class Method02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		///div함수가 돌려주는 int를 받기위해 int변수 선언, div의 값을 할당
		int num = div();

		///num이 가지고 있는 값을 출력
		System.out.println(num);
	}

	///div함수 정의
	public static int div() {
		///div함수가 하는일
		///정수형 변수 a,b를 선언하고 값을 a=10, b=5를 할당
		///a/b 계산을 하고 result라는 정수형에 할당.
		int a = 10, b = 5;
		int result = a / b;
		
		///result의 값을 내보내기
		return result;
	}
}
