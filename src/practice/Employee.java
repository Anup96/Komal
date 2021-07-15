package practice;

public class Employee {
	
	
	 int employerId;
	String name;
	static String Company="tcs";
	
	
		
	public Employee(int employerId, String name) {
		
		this.employerId = employerId;
		this.name = name;
		
	}
		
		public void display(){
			
			System.out.println(employerId+"  " + name+"  "+Company);
			
			
		}
	
	
	public static void main(String[] args) {
		
		Employee aa=new Employee(20,"abhi");
		aa.display();
		
		Employee bb=new Employee(50,"rahul");
		bb.display();
	}
	

}
