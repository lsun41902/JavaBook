package Chap05;

public class Method01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///문구 출력
		System.out.println("첫 번째 호출 메서드 입니다.");

		///method 함수 호출
		method();
		
		///문구 출력
		System.out.println("두 번째 호출 메서드 입니다.");
		
		///method 함수 호출
		method();
	}

	
	///method함수 정의
	public static void method() {
		///method함수가 하는 일
		///문구 출력
		///5+6 출력
		System.out.println("static 메서드 입니다.");
		System.out.println(5+6);
	}

}
