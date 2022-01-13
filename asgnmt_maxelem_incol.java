package january12;

import java.util.Scanner;

public class asgnmt_maxelem_incol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]a=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elemets in array:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int colmax=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[j][i]>colmax)
				{
					colmax=a[j][i];
				}
			}
			System.out.println("max elements in column are:"+colmax);
		}

	}

}
