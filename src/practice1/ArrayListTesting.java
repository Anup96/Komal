package practice1;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ArrayListTesting {
	public static void main(String[] args) {
		ArrayList<Student> alstu=new ArrayList<>();
		
		Student stu=new Student(12,"pune",new Phone(232,4000));
		Student stu1=new Student(12,"pune2",new Phone(232,8000));
		Student stu2=new Student(12,"pune3",new Phone(232,14000));
		Student stu3=new Student(12,"pune4",new Phone(232,3000));
		alstu.add(stu);
		alstu.add(stu1);
		alstu.add(stu2);
		alstu.add(stu3);		
		
	/*	
		
		Phone p=new Phone();
		p.cost=8000;
		p.mobNumber=99225253;
		
		
		Student stu=new Student();
		stu.age=26;
		stu.loc="kolhapur";
		stu.phone=p;
		
		alstu.add(stu);
		*/
		/*for (Student student :alstu){
			
			Phone p1=student.phone;	
			
			if(p1.cost>5000){
				System.out.println(student.loc);
			}
		}
		
		*/
		
		
		
		ArrayList<Integer> hhh= (ArrayList<Integer>) alstu.stream().map(xx -> xx.phone).map(yy->yy.cost).filter(zz-> zz > 5000).collect(Collectors.toList());
		System.out.println(hhh);
		
		
	/*	
		for (Student student :alstu){
			
		Phone p=student.phone;	
		
		if(p.cost>5000){
			System.out.println(student.loc);
		}
		
			
		}

		*/
		
	

	}}
