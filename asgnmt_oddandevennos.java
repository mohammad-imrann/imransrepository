package january11;

import java.util.Scanner;

public class asgnmt_oddandevennos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows");
		int row=sc.nextInt();
		System.out.println("Enter columns:");
		int column=sc.nextInt();
		int [][]arr=new int[row][column];
		System.out.println("Enter elements in array:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int even=0;
		int odd=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				if(arr[i][j]%2==0)
					even++;
				else
					odd++;
			}
		}
		System.out.println("Even numbers in the matrix are:"+even);
		System.out.println("Odd numbers in the matrix are:"+odd);
	}

}
