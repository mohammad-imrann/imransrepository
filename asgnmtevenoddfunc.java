package december28;

import java.util.Scanner;

public class asgnmtevenoddfunc {

	public static void main(String[] args) {
		
		evenoddnumber();
		
	}
		
		public static void evenoddnumber () {
			int n;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any number:");
			n=sc.nextInt();
			
				if(n%2==0)
				{
					System.out.println("even number.");
				}
				else
				{
					System.out.println("odd number");
				}
				
			}
		

	}
		
	


