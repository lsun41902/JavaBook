package Chap05;

public class Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///정수 a,b를 선언하고 a = 5, b = 6 값을 할당
		int a = 5, b = 6;
		
		///add함수 호출
		///파라미터 a,b 를 넘겨주기
		add(a,b);
	}

	
	///add함수의 정의
	///return이 없고 정수의 파라미터 x와 y가 필요하다
	public static void add(int x, int y) {
		///add함수가 하는일
		///x와 y의 합을 출력
		System.out.println(x + "(와)과 " + y +"의 합은 " + (x + y) + "입니다.");
	}
}
