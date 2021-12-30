package december29;

import java.util.Scanner;

public class asgnmtshopproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter number of products :");
		   int prod=sc.nextInt();
		   int cost=prod*100;
		   System.out.println("your total cost for the products is :"+cost);
		   if(cost>1000)
		   {
			   System.out.println("your cost after discount is:"+(cost-(cost*10)/100));
			   
		   }
		   else
		   {
			   System.out.println(cost);
		   }
		   
	}

}
