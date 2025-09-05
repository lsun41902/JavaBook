package Chap04;

public class Example09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;//정수형 변수 i를 선언, 값 1 할당
		do {
			System.out.println("Hello World");//hello world 출력
			i++;//해당줄 다음 부터 i는 1증가 되도록.
			
		}while(i < 6);//while문 조건 검사. i의 값은 위에서 i++했기에, 조건이 2 < 6으로 조건을 검사. i가 6보다 작으면 do를 반복.
		
		//while문이 끝나는 시점은 i가 6이 되었을때. 6 < 6 조건이면 while문이 성립하지 않음. 6은 6보다 작지않음.
		//while문 종료.
	}

}
