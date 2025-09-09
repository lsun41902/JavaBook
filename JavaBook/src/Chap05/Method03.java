package Chap05;

public class Method03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///정수형 변수 a와 b선언, a = 5, b = 6의 값을 할당.
		int a = 5, b = 6;
		
		///max가 돌려주는 정수형을 받기위해 정수형 변수 num 선언
		///num은 max가 돌려주는 정수를 받음.
		int num = max(a, b);
		
		///a, b, num이 가지고 있는 값을 출력
		System.out.println(a + "(완)과 " + b + "의 수 중 " + num + "이 큽니다.");
	}

	///max함수의 정의
	public static int max(int x, int y) {
		///max함수가 하는일
		///정수를 돌려주기 위해 정수형 변수 result 선언, 값 미할당
		int result;
		
		///x가 y보다 큽니까?
		if (x > y) {
			///x가 y보다 클때
			///result에 x값을 할당
			result = x;
		} else {
			///x가 y보다 크지 않을때
			///result에 y값을 할당
			result = y;
		}

		///result가 가지고 있는 값을 돌려준다
		return result;
	}
}
