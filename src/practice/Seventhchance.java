package practice;

public class Seventhchance {
public static void main(String[] args) {
int a[]={10,20,45,9,16,90,21,3,4};
	int sum=0;
	for(int i=0;i<a.length;i++){
			
	for(int j=0;j<a.length;j++){
		
		if(a[i]==a[j]*a[j])
		{
			sum=sum+a[j];
			System.out.println(a[j]);
			System.out.println(sum);
		}
	}
		
	}
	
}
	
	
	
}
