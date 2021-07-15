package interviewS;

public class PalindromeExample {
public static void main(String[] args) {
	int sum=0,r,temp;
	int n=424;
	temp=n;
	while(n>0){
		r=n%10;
		sum=sum*10+r;
		n=n/10;
	}
	if(temp==sum){
		System.out.println("number is palindrome");
	}
}
}
