package Chap04;

public class Example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for문 첫번째 칸: 조건에 사용할 기본 변수 지정, 정수형 i는 0의 값을 할당.
		//for문 두번째 칸: for문을 얼만큼 반복 실행할 건지에 대한 조건, i가 10보다 작거나 같을때는 계속 한다.
		//for문 세번째 칸: i는 for문이 한바퀴 돌고나면 +1 시킨다.
		for(int i = 0; i <= 10; i++) {
			
			//i 가 3 이거나 i는 6 이거나 i는 9일때
			if(i == 3 || i == 6 || i == 9) {
				//바로 for문을 마지막으로 한다.
				//continue를 만나는 즉시 아래 코드를 무시하고 바로 for문의 마지막으로 가는것과 동일.
				continue;
			}
			//continue를 만나지 않았다면 i를 출력
			System.out.println(i + " ");
		}
	}

}
