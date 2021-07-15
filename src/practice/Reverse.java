package practice;

public class Reverse {
public static void main(String[] args) {
	String Str1="I am an Automation Engineer";
	String reverse="  ";
	
	String[] Str2=Str1.split(" ");
	
	for(int i=0;i<=Str2.length-1;i++){
		String abc=Str2[i];
		for(int j=abc.length()-1;j>=0;j--){
			reverse=reverse+abc.charAt(j);
			
		}
		
	}
	System.out.println(reverse.toLowerCase());
}
}
