package january05;

import java.util.Scanner;

public class asgnmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[]arr=new int[10];
		System.out.println("Enter elements in array:");
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("elements are:");
		for(int i=0;i<10;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println("prime numbers in the array are:");
		for(int i=0;i<10;i++)
		{
			int count=0;
			for(int j=2;j<arr[i]-1;j++)
			{
				if(arr[i]%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(arr[i]);
			}
		}
		

	

	}
}
