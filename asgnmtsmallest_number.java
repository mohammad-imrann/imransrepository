package december30;

import java.util.Scanner;

public class asgnmtsmallest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three number of your choice");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		
		int result= (a<b) ? (a<c) ? a : c : (b<c) ? b : c;
		System.out.println("Smallest of the given three number is :"+ result);
	}
		

}
