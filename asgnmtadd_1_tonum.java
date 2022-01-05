package january03;

import java.util.Scanner;

public class asgnmtadd_1_tonum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num:");
		int num=sc.nextInt();
		int count=0;
		int d=1;
		
		while((num&d)!=0)
		{
			d=d<<1;
			count++;
		}
		for(int i=0;i<=count;i++)
		{
			int res=(int) Math.pow(2, i);
			num=num^1;
		}
		System.out.println(num);

	}

}
