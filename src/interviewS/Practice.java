package interviewS;

public class Practice {
public static void main(String[] args) {
	String abc="java by kiran";
	String[] s1=abc.split(" ");
	for(int i=0;i<=s1.length-1;i++){
		String s2=s1[i];
		for(int j=0;j<=s2.length()-1;j++){
			if(j==0){
				char ch=s2.charAt(j);
				ch=(char) (ch-32);
				System.out.print(ch);
			}
			else{
				System.out.print(s2.charAt(j));
			}
		}
		
	}
}
}
