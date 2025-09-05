package Chap04;

public class Break01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for문 첫번째칸, 정수 i는 0의 값을 할당한다.
		// for문 두번째칸, i가 10보다 작다면 for문을 게속 반복한다.
		// for문 세번째칸, for문이 한바퀴 다 돌았다면 i를 1증가한다.
		for (int i = 0; i < 10; i++) {

			// 만약 i가 5와 같다면?
			if (i == 5) {
				// for문을 끝낸다.
				// break가 실행되는 즉시 for문을 나감.
				// break 밑에 코드들은 실행되지 않는다.
				break;
			}
			System.out.println("i : " + i);
		}
	}

}
