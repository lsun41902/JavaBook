package Chap05;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5, b = 6;
		int sum = add(a, b);
		System.out.println(a + "(와)과 " + b + "의 합은 " + sum + "입니다.");
	}

	/// add함수의 정의
	public static int add(int x, int y) {
		/// ad함수가 하는일
		/// 들어온 x와 y의 값을 더해서 내보낸다.
		return x + y;
	}

}
