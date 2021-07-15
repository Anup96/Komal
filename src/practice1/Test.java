package practice1;
import java.util.ArrayList;
public class Test {
	
			public static void main(String[] args) {
				Fitness fit=new Fitness("120","125","130","12","Negative","Negative","Negative");
				Fitness fit1=new Fitness("120","125","130","12","PosItive","Negative","Negative");
				Fitness fit2=new Fitness("120","125","130","12","Negative","Negative","Negative");
				
				Person per=new Person(1,"Paras",new Address("15","25","Amravati Square","Amravati","Amravati",
						"Maharashtra","444604"),fit);
				Person per1=new Person(2,"Anup",new Address("20","10","Kolhapur Square","Kolhapur","Kolhapur",
						"Maharashtra","444452"),fit1);
				Person per2=new Person(3,"Sumit",new Address("16","12","Pune Square","Pune","Pune",
						"Maharashtra","444604"),fit2);
				
				ArrayList<Person> al=new ArrayList<>();
				al.add(per);
				al.add(per1);
				al.add(per2);
				
				for(Person pers:al)
				{
				System.out.println(pers.id+" "+pers.name+" "+pers.add.city+" "+pers.add.district+" "+pers.add.hoNo+
					" "+pers.add.pinCode+" "+pers.add.state+" "+pers.add.streetNo+" "+pers.fit.BP+" "+pers.fit.covidTest+" "+
					pers.fit.Hb+" "+pers.fit.malaria+" "+pers.fit.RBC+" "+pers.fit.WBC+" "+pers.fit.Typhoid);
				if(pers.fit.covidTest.equalsIgnoreCase("Positive"))
				{
					System.out.println("Patient must be in quarantine");
				}
				else {
					System.out.println("General Treatment");
				}
			}

				
}
}