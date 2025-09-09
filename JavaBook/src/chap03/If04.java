package chap03;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///문구 출력
		System.out.println("3개의 숫자를 입력하세요.");

		///입력 기능을 사용하기 위해 scanner 기능 가져오기 
		Scanner scanner = new Scanner(System.in);
		
		///입력을 세번 받기위해 scanner를 세번 사용
		///x의 값을 입력 받아 넣기
		///y의 값을 입력 받아 넣기
		///z의 값을 입력 받아 넣기
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		
		///x가 y보다 큽니까?
		if( x > y) {
			///x가 y보다 클때
			
			///x가 z보다 큽니까?
			if( x > z) {
				///x가 z보다 클때
				System.out.println(x + "는 가장 큰 정수입니다.");
			}else {
				///x가 z보다 크지 않을때
				System.out.println(x + "는 가장 큰 정수가 아닙니다.");
			}
		}else {
			///x가 y보다 크지 않을때
			System.out.println(x + "는 가장큰 정수가 아닙니다.");
		}
		
	}

}
