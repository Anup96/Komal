package practice;

public class Bcd {
	
	public Abc add(){
		Abc bb=new Abc();
		bb.m1();
		return bb;
	}
	
	public static void main(String[] args) {
		Bcd cc=new Bcd();
		Abc c=cc.add();
		System.out.println(c);
	}
}




/*public Abc add(){
	
	Abc aa=new Abc();
	aa.m1();
	return aa;
	
	
}
public static void main(String[] args) {
	
	Bcd bb=new Bcd();
	Abc c=bb.add();
	System.out.println(c);
}*/