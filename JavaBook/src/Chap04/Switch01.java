package Chap04;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("점수를 입력하세요");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		switch (num / 10) {
		case 10:
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;
		default:
			System.out.println("F 학점");
			break;
		}
	}

}
