package december29;

public class asgnmtvarlength {
	
	public static void varlength(int ...a )
	{
		
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		varlength(1,5,7,2,3);
	    
		
	 }
	  
		
		

	}


