package interviewS;

public class ReverseString {
	
	
	public static void main(String args[]) {
		
	String str[]={"anup jadhav"};
		for(int i=str.length-1;i>=0;i--){
			
			char temp[]=str[i].toCharArray();
			
			for(int j=temp.length-1;j>=0;j--){
				System.out.print(temp[j]);
			}
		}
		
		
		} 
	}
	


