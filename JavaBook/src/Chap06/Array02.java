package Chap06;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///실수형 배열 gradeArr 선언, 0~9인덱스 안에 값을 할당.
		double[] gradeArr = {90,70.5,80,79,82.5,50,70,90.2,89.5,89.7};
		
		///전체를 더해 저장할 변수, 실수를 더해 가지고 있을거기 때문에 실수형 double로 선언
		///실수형 변수 sum 선언, 값 0.0 할당
		double sum = 0.0;

		///배열의 크기만큼 반복하여 값을 차례차례 sum에 더하기
		///정수 i는 0이고
		///i는 gradeArr의 크기보다 작을때 까지 반복한다
		///i는 1씩 증가한다
		for(int i = 0; i < gradeArr.length; i++) {
			///sum 에 배열의 값을 차례차례 꺼내서 더하기
			sum += gradeArr[i];
		}

		///평균을 구할 변수 선언, 값은 (배열 내용의 전체 합 / 배열의 크기)
		///실수 average 변수 선언, sum / 배열크기 로 평균을 구한 값을 할당.
		double average = sum / gradeArr.length;
		
		///sum, 전체 합계 출력
		System.out.println("합계: " + sum);
		///평균의 소수점 2번째 까지로 줄여서 출력
		///%.2f를 사용하면 소수점 3번째 자리에서 반올림
		System.out.format("평균: %.2f",average);
	}

}
