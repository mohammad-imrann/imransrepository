package january12;

import java.util.Scanner;

public class asgnmt_lowertrimatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]a=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements");
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
		System.out.println("converting into Lower triangular matrix ");
		int rows=a.length;
		int columns=a[0].length;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				if(j>i)
					System.out.print("0");
				else
					System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
