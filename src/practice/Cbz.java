package practice;

public class Cbz  {
	
	
	
	public void m3(){     //1 st one
		Pract.m1();
		
	}
	
	
	public Pract2 m4(){                    //from object
		Pract2 dd=new Pract2();
		dd.m2();
		return dd;
	}
	
	
	
	
public static void main(String[] args) {
	Cbz aa=new Cbz();
	Pract2 h=aa.m4();
	System.out.println(h);
}
}
