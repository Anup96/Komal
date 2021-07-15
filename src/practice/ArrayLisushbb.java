package practice;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayLisushbb {
public static void main(String[] args) {
	
	
	ArrayList<String> abc=new ArrayList<String>();
abc.add("1");
abc.add("2");
abc.add("1");

HashSet<String> xyz=new HashSet<String>(abc);
System.out.println(xyz.size());
}
}
