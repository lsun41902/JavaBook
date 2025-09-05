package chap03;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		System.out.println(x < 10 && x < 20);//x는 10보다 작고 x는 20보다 작은가?
		System.out.println(x < 10 || x < 20);//x는 10보다 작거나 x는 20보다 작은가?
		System.out.println(!(x < 10 && x < 20));//x는 10보다 작으면서 x는 20보다 작지 않은가?
	}

}
