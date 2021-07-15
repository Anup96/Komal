package practice;

public class FourthChance {

	public static void main(String[] args) {
		
		
	int	array[] []={
			
			{3,5,4},
			{5,4,6},
			{8,15,6}
			
	};
	
	int sum=0;
	                                          
	for(int i=0;i<3;i++){
		
		for(int j=0;j<3;j++){
			
			if(i==1&&j==1||i==2&&j==2){
			
			 sum=sum+array[i][j];			
				
}
			else
				System.out.print("   ");
			
				
}
		System.out.println(" ");	
}
	System.out.print(sum);
	
	}
}
