package Chap06;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		///정수형 배열 선언
		int[] myArray = new int[5];//변수의 크기는 5
		myArray[0] = 10;//배열의 첫번째 칸에 값 정수 10 할당
		myArray[1] = 20;//배열의 두번째 칸에 값 정수 20 할당
		myArray[2] = 30;//배열의 세번째 칸에 값 정수 30 할당
		myArray[3] = 40;//배열의 네번째 칸에 값 정수 40 할당
		myArray[4] = 50;//배열의 다섯번째 칸에 값 정수 50 할당
		
		///for문 반복문을 이요해 myArray의 내용을 꺼내보기
		///정수 i 는 0이고
		///i는 5보다 작을때 반복한다 (5는 배열의 크기입니다)
		///i는 for문 한바퀴가 돌고나면 1증가한다
		for(int i = 0; i < 5; i++) {
			///myArray 첫번째 값을 꺼내고 싶으면 해당 인덱스 번호를 넣어주면 됨.
			System.out.println(i+"번째 요소값 : " + myArray[i]);//i는 반복문에 의해서 0부터 4까지 증가할 예정
			
			///40을 꺼내고 싶으면 myArray[3]을 입력
			///왜냐, myArray[3]에 40을 넣어뒀으니까. 
		}
	}

}
