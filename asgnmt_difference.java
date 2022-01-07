package january06;

import java.util.Arrays;
import java.util.Scanner;

public class asgnmt_difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a=new int[5];
		int[]b=new int[5];
		int[]c=new int[5];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array in first elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter elements in second array:");
		for(int i=0;i<a.length;i++)
		{
			b[i]=sc.nextInt();
			
		}
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i]-b[i];
			System.out.println(c[i]);
		}
				



	}

}
