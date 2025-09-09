package Chap06;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 2차원 배열 선언
		 * [][][]
		 * [][][]
		 * 
		 * 목표
		 * 0의 [국어점수][수학점수][평균]
		 * 1의 [국어점수][수학점수][평균]
		 * 0,1의 국어점수, 수학점수, 평균을 출력
		 */
		double[][] marks = new double[2][3];//3칸이 2줄 있는 실수형 배열 marks선언
		Scanner scanner = new Scanner(System.in);//입력 기능을 위해 scanner 가져오기

		/**
		 * 배열의 줄 수만큰 반복하여 칸에 값을 넣기
		 * i는 0이고
		 * i는 2보다 작을때 반복한다 (2는 줄의 수)
		 * i는 1씩 증가한다.
		 */
		for (int i = 0; i < 2; i++) {
			///통상 문서를 작성할때는 0 번째 학생은 없으니까. i+1을 이용해 1번 학생으로 만들기 위함
			System.out.println("학생번호" + (i + 1));
			
			///1번 학생의 marks[i][0]에 국어 점수 값 할당
			System.out.print("국어점수 : ");
			marks[i][0] = scanner.nextDouble();//실수형 입력을 받아 [i]번째 줄 [0]번째 칸에 값을 할당하기

			///1번 학생의 marks[i][1]에 수학 점수 값 할당
			System.out.print("수학점수 : ");
			marks[i][1] = scanner.nextDouble();//실수형 입력을 받아 [i]번째 줄 [1]번째 칸에 값을 할당하기

			///1번 학생의 marks[i][2]에 [i][0]에 있는 국어 점수와 [i][1]에 있는 수학 점수를 꺼내서 계산후 [i][2]에 평균을 넣기 
			marks[i][2] = (marks[i][0] + marks[i][1]) / 2;
			
			///for문의 끝. i는 1씩 증가한다.
		}

		/**
		 * 배열의 줄 수만큼 반복하여 칸의 내용물 꺼내기
		 * i는 0이고
		 * i는 2보다 작을때 반복한다(2는 줄의 수)
		 * i는 1씩 증가한다
		 */
		for (int i = 0; i < 2; i++) {
			///통상 문서를 작성할때는 0 번째 학생은 없으니까. i+1을 이용해 1번 학생으로 만들기 위함
			System.out.println("학생번호:" + (i + 1));
			System.out.print("국어점수: " + marks[i][0] + " ");//[i]번째 줄 [0]번째 칸의 값을 꺼내기
			System.out.print("수학점수: " + marks[i][1] + " ");//[i]번째 줄 [1]번째 칸의 값을 꺼내기
			System.out.println("평균: " + marks[i][2] + " ");//[i]번째 줄 [2]번째 칸의 값을 꺼내기
		}
		
	
	}

}
