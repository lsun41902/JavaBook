package Chap05;

public class Method06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///문구를 출력할때 sum() 함수를 호출하기
		///sum함수를 호출할때 10,20 두개의 정수를 넣어 보내기
		System.out.println("sum(10,20)의 값 :" +sum(10,20));//sum(10,20) 결과값이 return되어 문자와 결합
		
		///sum함수를 호출할때 10,20,30 세개의 정수를 넣어 보내기
		System.out.println("sum(10,20,30)의 값 :" +sum(10,20,30));//sum(10,20,30) 결과값이 return되어 문자와 결합
		
		///sum함수를 호출할때 10.5,20.5 두개의 실수를 넣어 보내기
		System.out.println("sum(10.5,20.5)의 값 :" +sum(10.5,20.5));//sum(10.5,20.5) 결과값이 return되어 문자와 결합
	}
	
	///sum함수의 정의
	///두개의 정수 x, y를 필요로 함
	public static int sum(int x, int y) {
		///해당 함수의 기능
		///x+y 계산하여 돌려주기
		return (x + y);
	}
	
	///sum함수의 정의
	///세개의 정수 x, y, z를 필요로 함
	public static int sum(int x, int y, int z) {
		///해당 함수의 기능
		///x+y+z 계산하여 돌려주기
		return (x + y + z);
	}
	
	///sum함수의 정의
	///두개의 실수 x, y를 필요로 함
	public static double sum(double x,double y) {
		///해당 함수의 기능
		///x+y 계산하여 돌려주기
		return (x + y);
	}
}
