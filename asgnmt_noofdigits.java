package december30;

import java.util.Scanner;

public class asgnmt_noofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number:");
		int num=sc.nextInt();
		int count=0;
		while(num>0)
		{
			count++;
			num=num/10;	
		}
		System.out.println(count);
		
		

	}

}
