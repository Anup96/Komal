package interviewS;

public class Fibionasis_Series {
public static void main(String[] args) {
	int m1=0,m2=1,m3,count=10;
	System.out.print(m1+" "+m2);
	
	for(int i=0;i<count;i++){
		m3=m1+m2;
		System.out.print(" "+m3);
		m1=m2;
		m2=m3;
	}
}
}
