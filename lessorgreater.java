package december28;

import java.util.Scanner;

public class lessorgreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		n=sc.nextInt();
		if(n<10)
		{
			System.out.println("number is lesser than 10");
			if(n<5)
				System.out.println("number is lesser than 5");
			else
				System.out.println("number is greater than 5");
		}
		else
		{
			System.out.println("number is greater than 10");
			
		
	}
	}
}

