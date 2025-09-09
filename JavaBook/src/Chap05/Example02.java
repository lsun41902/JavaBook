package Chap05;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		///greeting이 돌려주는 문자를 받기위해
		///String 문자열 변수 str 선언, greeting이 돌려준 값을 받기
		String str = greeting();
		
		///str이 가지고 있는 값 출력 + "JAVA"
		System.out.println(str + "JAVA");
	}

	
	///greeting함수의 정의
	public static String greeting() {
		///greeting함수가 하는일
		///Hi라는 문자를 돌려주기
		return "Hi";
	}

}
