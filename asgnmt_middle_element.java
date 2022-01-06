package january05;
import java.util.Scanner;

public class asgnmt_middle_element {
	public static int findmid(int[]arr) {
		int sum=0;int mid = 0;
		for(int i=0;i<10;i++)
		{
			 mid=(sum+arr[i])/2;
			
		}
		return mid;
	}
	
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	int [ ]arr=new int[10];
	    	for(int i=0;i<10;i++)
	    	{
	    		arr[i]=sc.nextInt();
	    	}
	    	System.out.println(findmid(arr));
	        
	    }

	

}
