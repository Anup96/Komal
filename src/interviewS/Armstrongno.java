package interviewS;

public class Armstrongno {
public static void main(String[] args) {
	
	 int sum=0,r,temp;  
	    int n=153;//It is the number to check armstrong  
	    temp=n;  
	    while(n>0)  
	    {  
	    r=n%10;  
	    sum=sum+(r*r*r);  
	    n=n/10; 
	    }  
	    if(temp==sum)  
	    System.out.println("armstrong number");   
	    else  
	        System.out.println("Not armstrong number");   
	   }  
	
//fjdnnbdnhdnjnj
///
///7865e
}
