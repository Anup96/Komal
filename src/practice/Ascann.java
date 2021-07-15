package practice;
import java.util.Scanner;
public class Ascann {
	int a=10;
	int b=40;
	int c;
	
	public void m1(){
		c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
	    int number;
        char choice;
        int evenSum = 0;
        int oddSum = 0;
        
        do
        {
            System.out.print("Enter the number ");
            number = console.nextInt();
        
            if( number % 2 == 0)
            {
                evenSum += number;
            }
            else
            {
                oddSum += number;
            }
        
            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);
            
        }while(choice=='y' || choice == 'Y');
        
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }  
}
		