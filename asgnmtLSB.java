package january03;

import java.util.Scanner;

public class asgnmtLSB {
	
	public static void main(String[] args) {
		        Scanner sc =new Scanner(System.in);
		        int num= sc.nextInt();
		        int rem=num%2;
		        if(rem==1)
		        {
		        	System.out.println("least significant bit is :"+"1");
		        }
		        else
		        {
		        	System.out.println("least significant bit is :"+"0");
		        }
		        
	}

}
