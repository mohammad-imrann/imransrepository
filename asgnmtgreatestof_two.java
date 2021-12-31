package december30;

import java.util.Scanner;

public class asgnmtgreatestof_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers of your choice:");
		int a= sc.nextInt();
		int b=sc.nextInt();
		
		int result=(a>b)? a : b;
		System.out.println("greatest of the two number is :" +result);

	}

}
