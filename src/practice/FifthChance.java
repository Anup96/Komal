package practice;

public class FifthChance {
	public static int revnumber(int n)
	{
		if(n<=4) {
			System.out.print(n);
			revnumber(n+1);
		}
		System.out.print(n);
		return n;
	}
	/*
	 public static void reverseMethod(int num) {
		 if (num <= 10) {
			  System.out.print(num % 10);
	           reverseMethod(num/10);
	           return;
		       }
		       else {
		    	   System.out.print(num);
				   
		       }
	 }
*/
	public static void main(String[] args)
		{
			int num=revnumber(1);
		/*	System.out.print(num);*/
		}

}


