package practice;

public class SixChance {
	
	public static int revnumber(int n)
	{
		if(n<=4) {
			System.out.print(n);
			revnumber(n+1);
		}
		System.out.print(n);
		return n;
	}
	
	public static void main(String[] args)
	{
		int num=revnumber(1);
	/*	System.out.print(num);*/
	}
	
}
