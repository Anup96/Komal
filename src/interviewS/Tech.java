package interviewS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Tech {
public static void main(String[] args) {
	
	int a=25;
	boolean flag=false;
	for(int i=2;i<a/2;i++){
		
		if(a%i==0){
			flag=true;
			break;
		}
	}
		if(!flag){
			System.out.println("This is prime number");
		}
		else{
			System.out.println("This is not a prime number");
		}
	}
	
	


}
