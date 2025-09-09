package chap03;

import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///문구 출력
		System.out.println("당신의 나이를 입력하세요.");
		
		///입력을 받기위해 scanner 기능 가져오기
		Scanner input = new Scanner(System.in);
		
		///입력 받은 값을 age라는 정수형 변수에 할당
		int age = input.nextInt();
		
		///age가 18보다 크거나 같습니까?
		if(age >= 18) {
			///18보다 크거나 같을때
			System.out.println("당신의 나이는 18세 이상입니다.");
			System.out.println("당신은 투표할 자격이 있습니다.");
		}
		
		///문구 출력
		System.out.println("이 문장은 if문 외부에 있습니다.");
	}

}
