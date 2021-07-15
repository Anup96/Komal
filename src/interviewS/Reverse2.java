package interviewS;

public class Reverse2 {
	public static void main(String[] args) {
		String s="Java By kiran";
		char[] ch=s.toCharArray();
		String abc[]=s.split(" ");
		for(int i=0;i<abc.length;i++){
			String s1=abc[i];
			for(int j=s1.length()-1;j>=0;j--){
			System.out.print(s1.charAt(j));
		}
		System.out.print(" ");
	}}

}
