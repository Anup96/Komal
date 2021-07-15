package interviewS;

import java.util.Scanner;

public class Palindrome_String {
public static void main(String[] args) {
	String reverse="";
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name");
	String original=sc.next();
	for(int i=original.length()-1;i>=0;i--){
		reverse=reverse+original.charAt(i);
	}
		if(original.equals(reverse)){
			System.out.println("This string is Palindrome_String ");
		}
		else{
			System.out.println("This string is not Palindrome_String ");
		}
	
}
}
