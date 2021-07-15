package practice;

public class Pract2 {

	static int a = 10;

	public void m1() {

		int b = 10;
		System.out.println(b);

	}

	public void m2() {
		m1();
		int c = 50;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Pract2 aa = new Pract2();
		System.out.println(aa.a);

	}

}
