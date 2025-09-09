package Chap05;

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///calculate 함수를 호출
		///파라미터값은 정수 두개를 보낸다.
		calculate(2,3);
		
		///calculate 함수를 호출
		///파라미터값은 실수 두개를 보낸다.
		calculate(2,3.14);
		
		///calculate 함수를 호출
		///파라미터값은 정수 한개를 보낸다.
		calculate(2);
		
		///calculate 함수를 호출
		///파라미터값은 실수 한개를 보낸다.
		calculate(2.5);
	}

	///calculate함수 정의
	///넘어온 파라미터가 두개의 정수 일때
	public static void calculate(int x, int y) {
		///calculate함수가 하는일
		///x*y를 출력한다
		System.out.println(x*y);
	}

	///calculate함수 정의
	///넘어온 파라미터가 한개의 정수, 한개의 실수가 넘어왔을때
	public static void calculate(int x, double y) {
		///calculate함수가 하는일
		///x*y를 출력한다
		System.out.println(x*y);
	}

	///calculate함수 정의
	///넘어온 파라미터가 한개의 정수가 넘어왔을때
	public static void calculate(int x) {
		///calculate함수가 하는일
		///x*x를 출력한다
		System.out.println(x*x);
	}

	///calculate함수 정의
	///넘어온 파라미터가 한개의 실수가 넘어왔을때
	public static void calculate(double x) {
		///calculate함수가 하는일
		///x*x를 출력한다
		System.out.println(x*x);
	}
}
