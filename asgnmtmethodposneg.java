package december28;

import java.util.Scanner;

public class asgnmtmethodposneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPosNeg();

		
	}
	public static void checkPosNeg()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		if( n>0)
		{
			System.out.println("positive number..");
		}
		else if(n<0)
		{
			System.out.println("negative number..");
		}
		else
		{
			System.out.println("invalid or zero..");
		}
	}

}
