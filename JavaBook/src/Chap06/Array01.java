package Chap06;

import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///문자열 배열 선언, 값 미할당
		String[] myArr;
		
		///문자열 배열 값 할당. 배열의 크기는 3칸
		myArr = new String[3];

		///입력기능을 사용하기 위해 scanner 가져오기
		Scanner scanner = new Scanner(System.in);
		
		///문구 출력
		System.out.println("3개 문자열을 입력하세요.");

		///배열의 크기만큼 반복해서 값을 입력 받을 예정
		///정수 i는 0이고
		///i는 3보다 작을때 반복한다.(3은 배열의 크기)
		///i는 1씩 증가한다
		for(int i = 0; i < 3; i++) {
			///배열의 첫번째 칸 부터 세번째 칸에 차례차례 입력한 값이 들어간다.
			myArr[i] = scanner.nextLine();
		}

		///위에서 입력받은 값을 가지고 있는 배열의 값을 꺼내보기
		///정수 i는 0이고
		///i는 3보다 작을때 반복한다.(3은 배열의 크기)
		///i는 1씩 증가한다
		for(int i = 0; i < 3; i++) {
			///배열에 i번째 값을 출력한다.
			///myArr[0] 첫번째 값, myArr[1] 두번째 값, myArr[2] 세번째 값
			System.out.print(myArr[i]);
		}
	}

}
