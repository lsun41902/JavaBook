package chap03;

public class Operator03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5, b = 10;
		System.out.println(a > b);// a가 b보다 큰가?
		System.out.println(!(a > b));// a가 b보다 크지 않은가?
		System.out.println((a == b) && (a == 5));// a는b 이면서 a는5인가?
		System.out.println((a != b) && (a == 5));// a는b가 아니면서 a == 5인가?
		System.out.println(!((a != b) && (a == 5)));// a는b가 아니면서 a==5가 아닌가?
	}

}
