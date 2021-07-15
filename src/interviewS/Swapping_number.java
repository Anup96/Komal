package interviewS;

import java.util.Scanner;

public class Swapping_number {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int x=sc.nextInt();
	int y=sc.nextInt();
	System.out.println("The number before swapping" +x+ " "+y);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("The number after swapping" +x+ " "+y);
}
}
