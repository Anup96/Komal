package pattern;

public class Assignment7 {
public static void main(String[] args) {
	/*int n=5;
	 for (int i=0; i<n; i++) //outer loop for number of rows(n)
     { 
     for (int j=n-i; j>1; j--) //inner loop for spaces
         { 
             System.out.print(" "); //print space
         }  
         for (int j=0; j<=i; j++ ) //inner loop for number of columns
         { 
             System.out.print("* "); //print star
         } 

         System.out.println(); //ending line after each row
     } 
}*/



int i, j, k;
for(i=5;i>=1;i--)
{
for(j=1;j<=i;j++)
{
System.out.print(" ");
}
for(k=5;k>=i;k--)
{
System.out.print("*");
}
System.out.println();
}
}
}

