package interviewS;

public class Prime_number {
public static void main(String[] args) {
	int a=23;
	boolean flag=false;
	for(int i=2;i<a/2;i++){
		
		if(a%i==0){
			 flag=true;
			break;
		}
		
	}
	if(!flag){
		System.out.println("The number is prime number");
	}
	else{
		System.out.println("The number is not prime number");
	}
}
}
