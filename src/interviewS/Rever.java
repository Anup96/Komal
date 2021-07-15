package interviewS;

public class Rever {

	
	public static void main(String[] args) {
		
		/*String str="abc";
		
		String aa=new StringBuffer(str).reverse().toString();         //By direct method
		System.out.println(aa);*/
		
		
		
		String str="input is given";
		
		
		char ch[]=str.toCharArray();
		                                                               //By array
		for(int i=ch.length-1;i>=0;i--){
			
			System.out.print(ch[i]);
		}
	}
	
}
