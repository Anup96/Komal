package interviewS;

import java.util.Scanner;

public class Max_min {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		System.out.println("Enter first number: "); 
		int n1 = in.nextInt(); 
		System.out.println("Enter second number: "); 
		int n2 = in.nextInt(); 
		System.out.println("Enter third number: "); 
		int n3 = in.nextInt(); 
		System.out.println("Choices: "); 
		System.out.println("1) Largest number"); 
		
		 
		 
		int large=Math.max(n1, Math.max(n2, n3));
		System.out.println(large);
		
		System.out.println("2) Smallest number"); 
		
		int small=Math.min(n1, Math.min(n1, n2));
		System.out.println(small);
		
	} 
	
		
}
