package interviewS;

import java.util.Scanner;

public class Tech2 {
public static void main(String[] args) {

	String abc="Anup Mahendra Jadhav";
	char[] ch=abc.toCharArray();	
	
	String[] s=abc.split(" ");
	
	for(int i=0;i<s.length;i++){
		String s2=s[i];
		for(int j=s2.length()-1;j>=0;j--){
			
			System.out.print(s2.charAt(j));
		}
		System.out.println();
	}
	
}
}
 