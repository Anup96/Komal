package interviewS;

import java.util.Scanner;

public class UppetLower2 {
public static void main(String[] args) {
char ch;

String s="java by kiran";
String abc[]=s.split(" ");
for(int i=0;i<abc.length;i++){
	String s1=abc[i];
for(int j=0;j<s1.length();j++){
	if(j==0){
		ch=s1.charAt(j);
		ch=(char) (ch-32);
		System.out.print(" "+ch);
	}
	else{
		System.out.print(s1.charAt(j));
	}
}
	
}

}
}
