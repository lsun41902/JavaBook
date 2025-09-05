package Chap04;

public class Continue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for문 첫번째칸, 정수 i 변수를 선언하고 1의 값을 할당.
		//for문 두번째칸, i는 4보다 작거나 같다면 계속 반복.
		//for문 세번째칸, i는 for문 한바퀴가 끝날때 마다 1씩 증가한다.
		for(int i = 1; i <= 4; i++) {
			
			//두번째 for문, 위에 사용한 i변수는 이미 사용했기에 중복 문제로 사용할 수 없음.
			//for문 첫번째칸, 정수 j를 새롭게 선언하고 j는 1을 할당.
			//for문 두번째칸, j는 3보다 작거나 같다면 계속 반복.
			//for문 세번째칸, j는 두번째 for문이 한바퀴 돌고나면 1씩 증가한다. 
			for(int j = 1; j <= 3; j++) {
				
				//i는 3과 같고, j는 2와 같을때
				if(i == 3 && j == 2) {
					//두번째 for문의 현재 바퀴를 건너뛴다.
					//해당 continue는 두번째 for문 안에 있기 때문에 첫번째 for문에 영향을 주지 않는다.
					continue;
				}
				
				//conticnue조건에 걸려서 생략되지 않았다면 i * j 값을 출력
				System.out.println(i + "*"+j);
			}
		}
	}

}
