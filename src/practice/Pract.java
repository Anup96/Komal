package practice;

public class Pract {

	static int a = 0;

	public static void m1() {

		int b = 10;
		System.out.println(b);

	}

	public void m2() {
		m1();
		int c = 50;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Pract aa = new Pract();
		aa.m2();

	}

}
