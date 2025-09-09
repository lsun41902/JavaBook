package Chap05;

public class Method05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///정수형 변수 a선언, 반지름의 값 4할당.
		int a = 4;
		
		///실수형 변수 pi선언, 값 3.14 할당
		double pi = 3.14;
		
		///문구 출력
		System.out.println("원의 둘레 구하는 공식 : 2 x 반지름 x 원주율 ");
		System.out.print("2 x" + a + " x " + pi + " = ");
		
		///calcualte함수 호출
		///파라미터 a와 pi를 넘겨주기
		calculayte(a, pi);//calculayte실행
	}

	///calculayte의 함수 정의
	///return타입 없고 파라미터 정수 x와 실수 y가 필요함.
	public static void calculayte(int x, double y) {
		///calculayte함수의 하는일
		///2*x*y 출력
		System.out.println(2 * x * y);
	}
}
