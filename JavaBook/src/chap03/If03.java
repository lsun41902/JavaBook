package chap03;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///문구 출력
		System.out.println("점수를 입력하세요.");

		///입력 기능을 사용하기 위해 scanner 가져오기
		Scanner s = new Scanner(System.in);
		
		///정수를 입력 받을거고, 입력 받은 정수를 grade에 넣기
		int grade = s.nextInt();
		
		///grade의 값이 90보다 크거나 같습니까?
		if (grade >= 90) {
			///grade의 값이 80보다 크거나 같을때
			System.out.println("A 학점");
		} else if (grade >= 80) {
			///grade의 값이 80보다 크거나 같을때
			System.out.println("B 학점");
		} else if (grade >= 70) {
			///grade의 값이 70보다 크거나 같을때
			System.out.println("C 학점");
		} else if (grade >= 60) {
			///grade의 값이 60보다 크거나 같을때
			System.out.println("D 학점");
		} else {
			///grade의 값이 위의 조건에 해당하는게 없을때
			System.out.println("F 학점");
		}
	}

}
