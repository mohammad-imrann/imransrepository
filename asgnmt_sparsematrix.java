package january12;

import java.util.Scanner;

public class asgnmt_sparsematrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows:");
		int row=sc.nextInt();
		System.out.println("Enter columns:");
		int columns=sc.nextInt();
		int[][]arr=new int[row][columns];
		int zero=0;
		System.out.println("Enter the elements:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<columns;j++)
			{
				arr[i][j]=sc.nextInt();
				if(arr[i][j]==0)
					zero++;
			}
		}
		if(zero>(row*columns)/2)
			System.out.println("the matrix is sparse matrix");
		else
			System.out.println("not a sparse matrix");
	}

}
