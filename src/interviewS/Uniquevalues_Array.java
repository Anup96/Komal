package interviewS;

import java.util.ArrayList;
import java.util.HashSet;

public class Uniquevalues_Array {
public static void main(String[] args) {
	 ArrayList<String> aListNumbers = new ArrayList<String>();
     
     //add elements to ArrayList
     aListNumbers.add("One");
     aListNumbers.add("Two");
     aListNumbers.add("Three");
     aListNumbers.add("One");
     aListNumbers.add("Four");
     
     /*
      * To get unique values from ArrayList, convert it to
      * HashSet using constructor of the HashSet class.
      * 
      * public HashSet(Collection c)
      */
     
     HashSet<String> hSetNumbers = new HashSet(aListNumbers);
     
     System.out.println("ArrayList Unique Values");
     
     //iterate through HashSet
     for(String strNumber : hSetNumbers)
         System.out.println(strNumber);
 
}
}
