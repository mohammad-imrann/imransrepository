package january05;

import java.util.Scanner;

public class asgnmt_sum {
	
	public static int getsum(int[] arr) {
		int res=0;
		for(int i=0;i<arr.length;i++)
		{
			res+=arr[i];
		}
		return res;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(getsum(arr));
	}

}
