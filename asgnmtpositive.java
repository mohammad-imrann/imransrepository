package january05;

import java.util.Scanner;

public class asgnmtpositive {
	public static void positive(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=0)
			{
				System.out.println("arr[i]");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			a[i]=sc.nextInt();
		}
		positive(a);
	}

}
