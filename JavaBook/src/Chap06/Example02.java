package Chap06;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///정수형 배열 myArr 선언, 첫번째:10, 두번째:20, 세번째:30, 네번째:40, 다섯번째:50 값을 할당
		int[] myArr = {10,20,30,40,50};
		
		///myArr크기만큼 반복하여 내용물 꺼내보기
		///정수형 i는 0 이고
		///i는 배열의 크기보다 작을때 반복한다
		///i는 1씩 증가한다
		for(int i = 0; i < myArr.length;i++) {
			///myArr[i]번째 값을 출력한다.
			System.out.println(i + "번째 요소값: " + myArr[i]);
		}
		
	}

}
